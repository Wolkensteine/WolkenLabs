package main.graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static Window instance = null;
	
	public Window (int x, int y, String Title) {
		
		this.setTitle(Title);
		this.setPreferredSize(new Dimension(x, y));
		this.setSize(getPreferredSize());
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public static Window getWindow() {
		if (Window.instance == null) {
			Window.instance = new Window(1920, 1080, "WolkenLabs");
		}
		return Window.instance;
	}
	
	public static Dimension getDimension() {
		return getDimension();
	}
	
}