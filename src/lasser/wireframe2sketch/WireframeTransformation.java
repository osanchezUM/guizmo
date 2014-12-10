package lasser.wireframe2sketch;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import lasser.sketch.Row;
import lasser.sketch.SketchRoot;
import lasser.sketch.SketchFactory;

import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.Checkbox;
import com.wireframesketcher.model.Combo;
import com.wireframesketcher.model.Image;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.Label;
import com.wireframesketcher.model.Panel;
import com.wireframesketcher.model.Group;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.ScreenFont;
import com.wireframesketcher.model.TextArea;
import com.wireframesketcher.model.TextField;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.Window;

public class WireframeTransformation {
	
	private static final SketchFactory factory = SketchFactory.eINSTANCE;
	
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
	
	private static final int LABEL_EXTRA_WIDTH = 10;
	private static final int DEFAULT_IMAGE_WIDTH = 100;
	
	private static final int WINDOW_BAR_HEIGHT_PX = 20;
	private static final int LABEL_H_PADDING_PX = 1;
	private static final int LABEL_V_PADDING_PX = 3;
	
	private static String screenFontName;
	private static int screenFontStyle;
	private static int screenFontSize;
	
	/*
	 * Execute the M2M transformation
	 */
	protected static SketchRoot execute(Screen screen){
		
		// Get the system font to calculate the actual size of the labels
		// Tahoma en WindowsXP, Segoe UI en Windows 7, Sans Serif en KUbuntu...
		ScreenFont sfont = screen.getFont();
		if (sfont.getName() != null)
			screenFontName = sfont.getName();
		else
			screenFontName = getSystemFont();
		screenFontStyle = Font.PLAIN;
		screenFontSize = sfont.getSize().getSize();
		
		SketchRoot root = factory.createSketchRoot();
		
		// Create windows
		List<Window> windows = new ArrayList<Window>();
		HashMap<Window, lasser.sketch.Window> windowMap = new HashMap<Window, lasser.sketch.Window>();
		for (Widget w: screen.getWidgets()){
			if (w instanceof Window){
				lasser.sketch.Window gwin = genWindow(w, root);
				windowMap.put((Window)w, gwin);
				windows.add((Window)w);
			}
		}
		// If there are no windows, create an artificial one
		if (root.getWindows().isEmpty()){
			genArtificialWindow(screen, root);
		}
		
		// Create widgets
		for (Widget w: screen.getWidgets()){
			if (!(w instanceof Window)){
				Window wwindow = lookForContainerWindow(w, windows);
				lasser.sketch.Window swindow = null;
				if (windows.isEmpty())
					swindow = root.getWindows().get(0);
				else if (wwindow != null)
					swindow = windowMap.get(wwindow);
				if (swindow != null)
					genWidget(w, wwindow, swindow);
			}
		}
		return root;
	}
	
	/*
	 * Generate windows
	 */
	private static lasser.sketch.Window genWindow(Widget w, SketchRoot root){
		lasser.sketch.Window window = factory.createWindow();
		window.setName(w.getText());
		//window.setId(w.getText());
		window.setId(w.getId().toString());
		window.setWidth(w.getMeasuredWidth());
		window.setHeight(w.getMeasuredHeight() - WINDOW_BAR_HEIGHT_PX);
		//window.setXPos(w.getX());
		//window.setYPos(w.getY());
		window.setXPos(0);
		window.setYPos(0);
		root.getWindows().add(window);
		return window;
	}
	
	/*
	 * Generate widgets
	 */
	private static void genWidget(Widget w, Widget container, lasser.sketch.Container parent){
		lasser.sketch.Widget newWidget = null;
		if (w instanceof TextField){
			lasser.sketch.TextBox tbox = factory.createTextBox();
			tbox.setText(((TextField)w).getText());
			newWidget = tbox;
		}else if (w instanceof TextArea){
			lasser.sketch.TextArea tarea = factory.createTextArea();
			tarea.setText(((TextArea)w).getText());
			newWidget = tarea;
		}else if (w instanceof Label){
			lasser.sketch.Label label = factory.createLabel();
			label.setText(((Label)w).getText());
			newWidget = label;
		}else if (w instanceof Button){
			lasser.sketch.Button button = factory.createButton();
			button.setText(((Button)w).getText());
			newWidget = button;
		}else if (w instanceof Image){
			lasser.sketch.Image image = factory.createImage();
			//Image wImage = (Image)w;
			//image.setText(wImage.getSrc());
			newWidget = image;
		}else if (w instanceof Combo){
			lasser.sketch.ComboBox combo = factory.createComboBox();
			combo.setText(((Combo)w).getText());
			newWidget = combo;
		}else if (w instanceof Checkbox){
			lasser.sketch.CheckBox cbox = factory.createCheckBox();
			cbox.setText(((Checkbox)w).getText());
			cbox.setSelected(((Checkbox)w).isSelected());
			newWidget = cbox;
		}else if (w instanceof com.wireframesketcher.model.List){
			lasser.sketch.RadioGroup rgroup = factory.createRadioGroup();
			com.wireframesketcher.model.List list = (com.wireframesketcher.model.List)w;
			List<lasser.sketch.RadioButton> rbuttons = convertRadioButtons(list);
			rgroup.getItems().addAll(rbuttons);
			newWidget = rgroup;
		}else if (w instanceof com.wireframesketcher.model.Table){
			lasser.sketch.Table table = factory.createTable();
			StringTokenizer st1 = new StringTokenizer(w.getText(), "\r\n");
		    while (st1.hasMoreTokens()) {
		    	Row row = factory.createRow();
		    	StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ",");
			    while (st2.hasMoreTokens()) {
			    	String str = st2.nextToken();
			    	str = str.replace("\"", "");
			    	row.getValues().add(str.trim());
			    }
			    table.getRows().add(row);
		    }
		    newWidget = table;
		}else if (w instanceof Panel){
			lasser.sketch.PlainPanel panel = factory.createPlainPanel();
			newWidget = panel;
		}else if (w instanceof Group){
			lasser.sketch.WidgetGroup group = factory.createWidgetGroup();
			group.setText(((Group)w).getText());
			newWidget = group;
		}else{
			throw new RuntimeException("Widget type not supported yet: "+
						w.getClass().getSimpleName());
		}
		setWidgetAttrs(w, newWidget, container);
		parent.getWidgets().add(newWidget);
		
		if (w instanceof WidgetContainer){
			for (Widget child: ((WidgetContainer)w).getWidgets()){
				genWidget(child, w, (lasser.sketch.Container)newWidget);
			}
		}
	}
	
	/*
	 * Set common attributes
	 */
	private static void setWidgetAttrs(Widget wwidget, lasser.sketch.Widget swidget, Widget wcontainer){
//		if (wwidget.getCustomId() != null && !wwidget.getCustomId().equals(""))
//			swidget.setId(wwidget.getCustomId());
//		else if (wwidget instanceof com.wireframesketcher.model.List){
//			String str = wwidget.getText();
//			str = str.replaceAll("\\(o\\)", "");
//			str = str.replaceAll("\n", "");
//			str = str.replaceAll(" ", "");
//			str = str.replaceAll("\\(", "");
//			str = str.replaceAll("\\)", "");
//			swidget.setId(str + "_" + wwidget.getId());
//		}else if (wwidget.getText() != null && !wwidget.getText().equals(""))
//			swidget.setId(wwidget.getText() + "_" + wwidget.getId());
//		else{
//			swidget.setId(wwidget.getType()+wwidget.getId().toString());
//		}
		swidget.setId(wwidget.getId().toString());
		
		Rectangle r = getActualArea(wwidget);
		
		// Make the coordinates relatives to the container window
		if (wcontainer != null){
			swidget.setXPos(r.x - wcontainer.getX());
			swidget.setYPos(r.y - wcontainer.getY() - WINDOW_BAR_HEIGHT_PX);
		}else{
			swidget.setXPos(r.x);
			swidget.setYPos(r.y);
		}
		swidget.setWidth(r.width);
		swidget.setHeight(r.height);

	}
	
	/*
	 * Converts WireframeSketcher items into radio buttons
	 */
	private static List<lasser.sketch.RadioButton> convertRadioButtons(com.wireframesketcher.model.List rgroup){
		List<com.wireframesketcher.model.Item> items = rgroup.getItems();
		ArrayList<lasser.sketch.RadioButton> buttons = new ArrayList<lasser.sketch.RadioButton>(items.size());
		for (com.wireframesketcher.model.Item item: items){
			lasser.sketch.RadioButton rbutton = factory.createRadioButton();
			String txt = item.getText();
			int i1 = txt.indexOf(")")+2;
			int i2 = txt.length();
			String t = txt.substring(i1, i2);
			rbutton.setText(t);
			rbutton.setId(t + "_" + rgroup.getId());
			if (txt.startsWith("(o)"))
				rbutton.setSelected(true);
			buttons.add(rbutton);
		}
		return buttons;
	}
	
	/*
	 * Gets the actual area (with right coordinates) of the widget
	 */
	private static Rectangle getActualArea(Widget wwidget){
		int actualx = 0;
		int actualy = 0;
		int actualw = 0;
		int actualh = 0;

		if (wwidget instanceof Label){
			Label label = (Label)wwidget;

			// Obtain the font
			int size = 0;
			if (label.getFont().getSize() != null){
				size = label.getFont().getSize().getSize();
			}else{
				size = screenFontSize;
			}
			int style = screenFontStyle;
			if (label.getFont() != null){
				if (label.getFont().getBold() != null){
					style = Font.BOLD;
				}else if (label.getFont().getItalic() != null){
					style = Font.ITALIC;
				}
			}


			// Calculate the actual area
			if (screenFontName != null){
				Font font = new Font("SansSerif", style, size);
				
				// Measure the size of the font
				java.awt.Label l = new java.awt.Label();
				FontMetrics metrics = l.getFontMetrics(font);
				int h = metrics.getHeight();
				int w = metrics.stringWidth(label.getText());

				//System.out.println(label.getText() + ": w=" + label.getMeasuredWidth());
				//System.out.println(label.getText() + ": real w=" + realArea.width);

				actualx = label.getX() + LABEL_H_PADDING_PX;
				actualy = label.getY() + LABEL_V_PADDING_PX;
				actualw = w;
				actualh = h;
			}else{
				actualx = label.getX() + LABEL_H_PADDING_PX;
				actualy = label.getY() + LABEL_V_PADDING_PX;
				actualw = label.getMeasuredWidth() - (2 * LABEL_H_PADDING_PX);
				actualh = label.getMeasuredHeight() - (2 * LABEL_V_PADDING_PX);
			}


			//System.out.println(label.getText()+": ("+wwidget.getX()+", "+wwidget.getY()+") w=" + 
			//		wwidget.getMeasuredWidth()+", h="+wwidget.getMeasuredHeight());
			//System.out.println("   -> ("+actualx+", "+actualy+") w="+actualw+", h="+actualh);

		}else{
			actualx = wwidget.getX();
			actualy = wwidget.getY();
			if (wwidget instanceof Image){
				if (wwidget.getWidth() == -1)
					actualw = DEFAULT_IMAGE_WIDTH;
				else
					actualw = wwidget.getWidth();
				if (wwidget.getHeight() == -1)
					actualh = DEFAULT_IMAGE_WIDTH;
				else
					actualh = wwidget.getHeight();
			}else{
				actualw = wwidget.getMeasuredWidth();
				actualh = wwidget.getMeasuredHeight();
			}
		}
		return new Rectangle(actualx, actualy, actualw, actualh);
	}
	
	/*
	 * If there are no windows, create a new artificial window
	 */
	private static void genArtificialWindow(Screen screen, SketchRoot root){
		lasser.sketch.Window window = factory.createWindow();
		window.setName(screen.getName());
		window.setId(screen.getName());
		int xmax = DEFAULT_WIDTH;
		int ymax = DEFAULT_HEIGHT;
		for (Widget w: screen.getWidgets()){
			int kx = w.getX() + w.getWidth();
			int ky = w.getY() + w.getHeight();
			if (kx > xmax)
				xmax = kx;
			if (ky > ymax)
				ymax = ky;
		}
		window.setWidth(xmax);
		window.setHeight(ymax);
		window.setXPos(0);
		window.setYPos(0);
		root.getWindows().add(window);
	}
	
	
	
	/*
	 * Looks for the window that contains a widget
	 */
	private static Window lookForContainerWindow(Widget w, List<Window> windows){
		for(Window win: windows){
			if (contains(win, w))
				return win;
		}
		return null;
	}
	
	/*
	 * 
	 */
	private static boolean contains(Window window, Widget w){
		Rectangle rwin = getActualArea(window);
		Rectangle rw = getActualArea(w);
		return rwin.contains(rw);
	}
	
	
	/******************/
	
	/*
	 * 
	 */
	private static final String getSystemFont()
	{
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("windows")){
			if (os.contains("xp")){
				return "Tahoma";
			}else if (os.contains("7")){
				return "Segoe UI";
			}
			// Windows 8 uses Segoe WP???
			else if (os.contains("8")){
				return "Segoe UI";
			}
		}else if (os.contains("linux")){
			if (os.contains("ubuntu")){
				return "SansSerif";
			}
		}
		System.err.println("I cannot determine the system font for " + os +" ! (WireframeTransformation)");
		return null;
	}

}
