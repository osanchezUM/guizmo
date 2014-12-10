package guizmo.structure2tiles;

import static java.lang.System.out;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.Relation;
import guizmo.tiles.Tile;
import guizmo.tiles.utilM.TileUtil;

import java.util.ArrayList;
import java.util.Iterator;

import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.clustering.KMedoids;
import net.sf.javaml.clustering.MultiKMeans;
import net.sf.javaml.clustering.evaluation.AICScore;
import net.sf.javaml.clustering.evaluation.ClusterEvaluation;
import net.sf.javaml.clustering.evaluation.SumOfCentroidSimilarities;
import net.sf.javaml.clustering.evaluation.SumOfSquaredErrors;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.core.DefaultDataset;
import net.sf.javaml.core.DenseInstance;
import net.sf.javaml.core.Instance;
import net.sf.javaml.distance.EuclideanDistance;

import org.uncommons.maths.statistics.DataSet;

public class AdaptableClosenessClustering implements ClosenessClustering{
	
	private double distances[];
	private double maxDeviation;
	private static final double DEFAULT_MAX_DEVIATION = 15;
	private static final int MAX_CLUSTERS = ClosenessType.values().length;
	private int numClusters;
	private double means[];
	private double deviations[];
	private int limits[];
	
	public AdaptableClosenessClustering(Tile tile){
		this(tile, DEFAULT_MAX_DEVIATION);
	}
	
	public AdaptableClosenessClustering(Tile tile, double maxDeviation){
		initDistances(tile);
		this.maxDeviation = maxDeviation;
		inferClusters();
		printDebug();
	}
	
	private void initDistances(Tile tile){
		int n = tile.getRelations().size();
		distances = new double[n];
		for (int i=0; i<n; ++i){
			Relation r = tile.getRelations().get(i);
			Tile source = r.getSource();
			Tile target = r.getTarget();
			int d = -1;
			if (TileUtil.isHorizontal(r)){
				d = target.getXMinPos() - source.getXMaxPos();
			}else{
				d = target.getYMinPos() - source.getYMaxPos();
			}
			distances[i] = d;
		}
	}
	
	private void inferClusters(){
		int k = 1;
		double clusters[][] = new double[MAX_CLUSTERS][];
		clusters[k-1] = distances;
		double m[] = new double[MAX_CLUSTERS]; 
		m[k-1] = mean(distances);
		double d[] = new double[MAX_CLUSTERS];
		d[k-1] = deviation(distances);
		boolean clusterDeviationOK;
		
		// Apply clustering while the standard deviation of each group is greater than a parameter
		while(true){
			clusterDeviationOK = true;
			for (int i=0; i<k; ++i){
				if (d[i] >= maxDeviation){
					clusterDeviationOK = false;
					break;
				}
			}
			
			if (clusterDeviationOK || k == MAX_CLUSTERS)
				break;
			else{
				++k;
				Dataset dataset = prepareDataSet(distances);
				ClusterEvaluation evaluation = //new SumOfCentroidSimilarities();
						new SumOfSquaredErrors();
				Clusterer clusterer = 
						//new KMeans(k);
						//new KMedoids(k, 100, new EuclideanDistance());
						new MultiKMeans(k, 50, 40, new EuclideanDistance(), 
								evaluation
						);
				Dataset result[] = clusterer.cluster(dataset);
				//double intraCluster = evaluation.score(result);
				//System.out.println("@ Sum of similarities for "+k+" groups: "+intraCluster);
				int j = 0;
				for (Dataset resultSet: result){

					double c[] = datasetToArray(resultSet);
					m[j] = mean(c);
					d[j] = deviation(c);
					clusters[j] = c;
					++j;
				}
			}
		} // end_while
		
		means = new double[k];
		deviations = new double[k];
		limits = new int[k];
		if (k > 1){
			// Order the clusters
			double samples[] = new double[k];
			int indexes[] = new int[k];
			for (int i=0; i<k; ++i){
				samples[i] = clusters[i][0];
				indexes[i] = i;
			}
			quicksort(samples, 0, k-1, indexes);
			// Set the limits
			numClusters = k;
			for (int i=0; i<k; ++i){
				int oldIndex = indexes[i];
				means[i] = Math.round(m[oldIndex] * 100)/100d;
				deviations[i] = Math.round(d[oldIndex] * 100)/100d;
				double max = Integer.MIN_VALUE;
				for (double value: clusters[oldIndex]){
					if (value > max)
						max = value;
				}
				limits[i] = (int)max+1;
			}
		}else{
			numClusters = 1;
			means[0] = Math.round(m[0] * 100)/100d;
			deviations[0] = Math.round(d[0] * 100)/100d;
			limits[0] = Integer.MAX_VALUE;
		}

	}
	
	private double mean(double values[]){
		DataSet dset = new DataSet();
		for (double n: values)
			dset.addValue(n);
		return dset.getArithmeticMean();
	}
	
	private double deviation(double values[]){
		DataSet dset = new DataSet();
		for (double n: values)
			dset.addValue(n);
		return dset.getStandardDeviation();
	}
	
	private Dataset prepareDataSet(double values[]){
		Dataset dset = new DefaultDataset();
		for (double n: values){
			double val[] = new double[1];
			val[0] = n;
			Instance inst = new DenseInstance(val);
			dset.add(inst);
		}
		return dset;
	}
	
	private double[] datasetToArray(Dataset dataset){
		double result[] = new double[dataset.size()];
		int i = 0;
		Iterator<Instance> iter = dataset.iterator();
		while (iter.hasNext()){
			Instance inst = iter.next();
			double value = inst.value(0);
			result[i++] = value;
		}
		return result;
	}
	
	/*
	 * Quicksort sorting algorithm
	 * From the smallest value to the greatest one
	 */
	public static void quicksort(double x[], int lo, int ho, int indexes[]){
		double t;
		int indexAux;
		int l = lo, h = ho;
		double mid;
		if (ho > lo){
			mid = x[(lo + ho) / 2];
			while (l < h){
				while ((l < ho) && (x[l] < mid))
					++l;
				while ((h > lo) && (x[h] > mid))
					--h;
				if (l <= h){
					t = x[l];
					x[l] = x[h];
					x[h] = t;
					indexAux = indexes[l];
					indexes[l] = indexes[h];
					indexes[h] = indexAux;
					++l;
					--h;
				}
			}
			if (lo < h)
				quicksort(x, lo, h, indexes);
			if (l < ho)
				quicksort(x, l, ho, indexes);
		}
	}
	
	public ClosenessType estimateCloseness(Relation relation) {
		int distance = -1;
		if (TileUtil.isHorizontal(relation))
			distance = relation.getTarget().getXMinPos() - relation.getSource().getXMaxPos();
		else
			distance = relation.getTarget().getYMinPos() - relation.getSource().getYMaxPos();
		
		if (numClusters == 1){
			return ClosenessType.VERY_CLOSE;
		}else if (numClusters == 2){
			if (distance < limits[0])
				return ClosenessType.VERY_CLOSE;
			else
				return ClosenessType.CLOSE;
		}else if (numClusters == 3){
			if (distance < limits[0])
				return ClosenessType.VERY_CLOSE;
			else if (distance < limits[1])
				return ClosenessType.CLOSE;
			else
				return ClosenessType.FAR;
		}else if (numClusters == 4){
			if (distance < limits[0])
				return ClosenessType.VERY_CLOSE;
			else if (distance < limits[1])
				return ClosenessType.CLOSE;
			else if (distance < limits[2])
				return ClosenessType.FAR;
			else
				return ClosenessType.VERY_FAR;
		}else{
			throw new RuntimeException("Wrong number of clusters: "+numClusters);
		}
	}

	public int getNumClusters() {
		return numClusters;
	}

	public double[] getMeans() {
		return means;
	}

	public double[] getDeviations() {
		return deviations;
	}

	public int[] getLimits() {
		return limits;
	}
	
	private void printDebug(){
		System.out.println("Number of clusters found: "+numClusters);
		for (int i=0; i<numClusters; ++i){
			System.out.println("Cluster "+i+": limit="+limits[i]+", deviation="+deviations[i]+", mean="+means[i]);
		}
		System.out.println();
	}
	
}
