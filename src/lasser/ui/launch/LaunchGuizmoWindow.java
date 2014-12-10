package lasser.ui.launch;


import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import lasser.facade.LasserException;
import lasser.facade.LasserFacade;
import lasser.ui.popup.actions.GenLayoutModelAction;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class LaunchGuizmoWindow{
	
	private static final String WIREFRAME_EXTENSION = ".screen";
	private static final String STRUCTURE_EXTENSION = "_struc.xmi";
	private static final String LAYOUT_EXTENSION = "_lyt.xmi";
	
	private LaunchGuizmoWindow(){};
	
	public static Shell create(Shell parent, HashMap<String, Object> parameters){
		
		// Retrieve parameters
		final String wireframePath = (String)parameters.get(GenLayoutModelAction.WIREFRAME_MODEL_PATH);
		String modelPath = (String)parameters.get(GenLayoutModelAction.MODEL_PATH);
		String outputPath = (String)parameters.get(GenLayoutModelAction.OUTPUT_PATH);
		int hAlignmentMargin = (Integer)parameters.get(GenLayoutModelAction.HORIZONTAL_ALIGNMENT_MARGIN);
		int vAlignmentMargin = (Integer)parameters.get(GenLayoutModelAction.VERTICAL_ALIGNMENT_MARGIN);
		int comparisonMargin = (Integer)parameters.get(LasserFacade.COMPARISON_MARGIN_PX);
		int clusterDeviation = (Integer)parameters.get(LasserFacade.MAX_CLUSTER_DEVIATION);

		final String separator = System.getProperty("file.separator");
		final String basename = wireframePath.substring(wireframePath.lastIndexOf(separator)+1, wireframePath.indexOf('.'));
		
		// Create window
        final Shell shell = new Shell(parent, SWT.MIN | SWT.MAX | SWT.RESIZE);
        shell.setText("Layout Guesser launcher");
        shell.setSize(900, 450);
        Display display = shell.getDisplay();
        
        // Change font size
        Font originalFont = shell.getFont();
        FontData fontData[] = originalFont.getFontData();
        for (FontData fdata: fontData){
        	fdata.setHeight(12);
        }
        Font font = new Font(display, fontData);
        
        GridLayout mainLayout = new GridLayout(1, false);
        shell.setLayout(mainLayout);
        
        GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.marginWidth = 20;
        gridLayout.marginHeight = 20;
        gridLayout.horizontalSpacing = 20;
        gridLayout.verticalSpacing = 10;
        Composite parameterForm = new Composite(shell, SWT.NONE);
        parameterForm.setLayout(gridLayout);
        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.horizontalAlignment = SWT.FILL;
        parameterForm.setLayoutData(gridData);
     
        createLabel(parameterForm, font, "Wireframe path");
        Text wireframePathField = createTextField(parameterForm, font, wireframePath);
        wireframePathField.setEditable(false);
        createLabel(parameterForm, font, "Model path");
        final Text modelPathField = createDirectoryField(shell, parameterForm, font, modelPath);
        createLabel(parameterForm, font, "Output path");
        final Text outputPathField = createDirectoryField(shell, parameterForm, font, outputPath);
        createLabel(parameterForm, font, "Layouts to use");
        Composite layoutTypes = new Composite(parameterForm, SWT.NONE);
        layoutTypes.setLayout (new RowLayout ());
        final Button hFlowCheck = createCheckBox(layoutTypes, font, "HFlow");
        final Button vFlowCheck = createCheckBox(layoutTypes, font, "VFlow");
        final Button gridCheck = createCheckBox(layoutTypes, font, "Grid");
        final Button borderCheck = createCheckBox(layoutTypes, font, "Border");
        final Button formCheck = createCheckBox(layoutTypes, font, "Form");
        createLabel(parameterForm, font, "Max closeness cluster deviation");
        final Spinner deviationField = createPerCentSpinner(parameterForm, font, clusterDeviation);
        createLabel(parameterForm, font, "Horizontal alignment margin %");
        final Spinner hAlignmentMarginField = createPerCentSpinner(parameterForm, font, hAlignmentMargin);
        createLabel(parameterForm, font, "Vertical alignment margin %");
        final Spinner vAlignmentMarginField = createPerCentSpinner(parameterForm, font, vAlignmentMargin);
        createLabel(parameterForm, font, "Comparison margin px");
        final Spinner comparisonMarginField = createPerCentSpinner(parameterForm, font, comparisonMargin);
        
        Button runButton = createButton(shell, font, "Run");
        gridData = new GridData();
        gridData.horizontalAlignment = SWT.CENTER;
        runButton.setLayoutData(gridData);
        
        
        runButton.addSelectionListener(new SelectionListener(){

			public void widgetSelected(SelectionEvent e) {
				String basedir = modelPathField.getText();
				String outputdir = outputPathField.getText();
				String strucModel = basedir + basename + STRUCTURE_EXTENSION;
				String layoutModel = basedir + basename + LAYOUT_EXTENSION;
				
				ArrayList<LasserFacade.LayoutKind> ltypes = new ArrayList<LasserFacade.LayoutKind>(5);
				if (hFlowCheck.getSelection())
					ltypes.add(LasserFacade.LayoutKind.HORIZONTAL_FLOW_LAYOUT);
				if (vFlowCheck.getSelection())
					ltypes.add(LasserFacade.LayoutKind.VERTICAL_FLOW_LAYOUT);
				if (gridCheck.getSelection())
					ltypes.add(LasserFacade.LayoutKind.GRID_LAYOUT);
				if (borderCheck.getSelection())
					ltypes.add(LasserFacade.LayoutKind.BORDER_LAYOUT);
				if (formCheck.getSelection())
					ltypes.add(LasserFacade.LayoutKind.FORM_LAYOUT);
				LasserFacade.LayoutKind layoutTypes[] = new LasserFacade.LayoutKind[ltypes.size()];
				for (int i = 0; i < ltypes.size(); ++i)
					layoutTypes[i] = ltypes.get(i);
				float alignmentMargins[] = new float[2];
				alignmentMargins[0] = Float.parseFloat(hAlignmentMarginField.getText());
				alignmentMargins[1] = Float.parseFloat(vAlignmentMarginField.getText());
				float deviation = Float.parseFloat(deviationField.getText());
				int comparisonMargin = Integer.parseInt(comparisonMarginField.getText());
				
				HashMap<String, Object> options = new HashMap<String, Object>();
				options.put(LasserFacade.LAYOUT_TYPES_ALLOWED, layoutTypes);
				options.put(LasserFacade.MAX_CLUSTER_DEVIATION, deviation);
				options.put(LasserFacade.HV_ALIGNMENT_MARGINS, alignmentMargins);
				options.put(LasserFacade.COMPARISON_MARGIN_PX, comparisonMargin);
				options.put(LasserFacade.TEMP_MODEL_PATH, basedir);
				
				try{
					
					// Invoke the layout inference
						LasserFacade.instance().
							genLayoutModelFromWireframeSketcher(wireframePath, strucModel, layoutModel, options);
					// Invoke the layout generator
					LasserFacade.instance().genSwingUI(strucModel, layoutModel, outputdir);
					
					// Register the layout metamodel to open the models
					EPackage.Registry.INSTANCE.put(
							guizmo.layout.LayoutPackage.eINSTANCE.getNsURI(),
							guizmo.layout.LayoutPackage.eINSTANCE
					);
					
					// Print and informative message
					MessageDialog.openInformation(
						shell,
						"Layout Guesser success",
						"The layout inference and the UI code has been generated in "+outputdir);
					
					shell.dispose();
					
				}catch(Exception exception){
					// Print error message
					MessageDialog.openInformation(
							shell,
							"Layout Guesser execution error",
							exception.getMessage() + "\n" + exception.getStackTrace().toString());
				}
				
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
			
		});
        
        return shell;
        
	}
	
	////////////////////////////////////////
	////////////////////////////////////////
	////////////////////////////////////////
	
	private static Label createLabel(Composite parent, Font font, String txt){
        Label label = new Label(parent, SWT.NONE);
        label.setText(txt);
        label.setFont(font);
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.END;
        label.setLayoutData(gridData);
        return label;
	}
	
	private static Text createTextField(Composite parent, Font font, String txt){
        Text text = new Text(parent, SWT.SINGLE | SWT.BORDER);
        text.setText(txt);
        text.setFont(font);
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        text.setLayoutData(gridData);
        return text;
	}
	
	private static Button createCheckBox(Composite group, Font font, String txt){
		Button button = new Button(group, SWT.CHECK);
		button.setText(txt);
		button.setFont(font);
		button.setSelection(true);
		return button;
	}
	
	private static Spinner createPerCentSpinner(Composite parent, Font font, int defaultValue){
		Spinner spinner = new Spinner(parent, SWT.NONE);
		spinner.setMinimum(1);
		spinner.setMaximum(100);
		spinner.setSelection(defaultValue);
		spinner.setFont(font);
		return spinner;
	}
	
	private static Button createButton(Composite parent, Font font, String txt){
		Button button = new Button(parent, SWT.PUSH);
		button.setText(txt);
		button.setFont(font);
		return button;
	}
	
	private static Text createDirectoryField(final Shell shell, Composite parent, Font font, final String path){
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.horizontalSpacing = 10;
        gridLayout.verticalSpacing = 0;
        gridLayout.marginTop = 0;
        gridLayout.marginLeft = 0;
		composite.setLayout(gridLayout);
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        composite.setLayoutData(gridData);
		final Text tfield = createTextField(composite, font, path);
        gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        tfield.setLayoutData(gridData);
		Button button = createButton(composite, font, "Browse");
		button.addSelectionListener(new SelectionListener(){

			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog fd = new DirectoryDialog(shell, SWT.OPEN);
		        fd.setText("Select directory");
		        String basePath = path.substring(0, path.lastIndexOf("\\"));
		        System.out.println(basePath);
		        fd.setFilterPath(basePath);
		        //String filterExt[] = {filter};
		        //fd.setFilterExtensions(filterExt);
		        String selectedFile = fd.open();
		        if (selectedFile != null)
		        	tfield.setText(selectedFile);
			}

			
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			
		});
		return tfield;
	}
	
}
