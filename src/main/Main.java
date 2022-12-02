package main;

import main.graphics.Output;
import main.utils.Logger;

public class Main {

	public static int refreshRate = 30;
	
	public static void main(String[] args) {
		
		Logger.log("Main", "Starting up ...");
		
		// TODO start logic thread
		
		Logger.log("Main", "Starting the simulation visiualisation ...");
		
		main.graphics.Window.getWindow();
		
		while (true) {
			Output.refresh();
			try {
				Thread.sleep(1000/refreshRate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
