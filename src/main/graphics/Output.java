package main.graphics;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Output extends JPanel {

	private BufferedImage canvas;
	
	private static Output instance = null;
	
	public Output(Dimension dimension) {
		canvas = new BufferedImage((int)dimension.getHeight(), (int)dimension.getHeight(), BufferedImage.TYPE_INT_ARGB);
	}
	
	public static Output getOutput() {
		if (Output.instance == null) {
			Output.instance = new Output(Window.getDimension());
		}
		return Output.instance;
	}
	
	public static void refresh() {
		
	}
	
}