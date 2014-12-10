package lasser.ui.popup.actions;

import java.io.IOException;
import java.util.HashMap;

import lasser.facade.LasserException;
import lasser.facade.LasserFacade;
import lasser.ui.launch.LaunchGuizmoWindow;
//import lasser.modelUtil.ModelUtil;
//import lasser.sketch.SketchRoot;
//import lasser.wireframe2sketch.WireframeSketcher2Sketch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenLayoutModelAction implements IObjectActionDelegate {

	private Shell parentShell;
	private String filePath;
	private String fileName;
	

	
	public static final String WIREFRAME_MODEL_PATH = "wireframe_path";
	public static final String MODEL_PATH = "model_path";
	public static final String OUTPUT_PATH = "output_path";
	public static final String HORIZONTAL_ALIGNMENT_MARGIN = "h_align_margin";
	public static final String VERTICAL_ALIGNMENT_MARGIN = "v_align_margin";
	
	/**
	 * Constructor for Action1.
	 */
	public GenLayoutModelAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		parentShell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		String basedir = filePath.substring(0, filePath.indexOf(fileName));
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(WIREFRAME_MODEL_PATH, filePath);
		options.put(MODEL_PATH, basedir);
		options.put(OUTPUT_PATH, basedir);
		options.put(HORIZONTAL_ALIGNMENT_MARGIN, 15);
		options.put(VERTICAL_ALIGNMENT_MARGIN, 15);
		options.put(LasserFacade.COMPARISON_MARGIN_PX, 15);
		options.put(LasserFacade.MAX_CLUSTER_DEVIATION, 15);
		
		// Display the parameter window
		Shell shell = LaunchGuizmoWindow.create(parentShell, options);
		Display display = shell.getDisplay();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		IFile file = getFile(selection);
		if (file != null){
			fileName = file.getFullPath().segment(file.getFullPath().segmentCount()-1);
			filePath = file.getRawLocation().toOSString();
		}
	}
	
	
	private IFile getFile(ISelection selection){
	    IFile file = null;
		if (selection instanceof IStructuredSelection) {
	        IStructuredSelection ssel = (IStructuredSelection) selection;
	        Object obj = ssel.getFirstElement();
	        try{
	        	file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
	        }catch(org.eclipse.core.runtime.AssertionFailedException e){
	        	System.err.println(e.getMessage());
	        }
	        if (file == null) {
	            if (obj instanceof IAdaptable) {
	                file = (IFile) ((IAdaptable) obj).getAdapter(IFile.class);
	            }
	        }
	    }
		return file;
	}

}
