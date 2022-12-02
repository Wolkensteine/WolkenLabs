package main.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

	public static boolean log(String Module, String Message) {
		
		FileWriter LogWriter;
		LocalDate Date = LocalDate.now();
		LocalDateTime DateTime = LocalDateTime.now();
		File LoggingFile = new File("Logs/" + Date + ".txt");
		
		try {
			
			if (LoggingFile.createNewFile()) {		
				
				log("Main > Logger >", "Created Log file!");
						
				try {
					LogWriter = new FileWriter("Logs/" + Date + ".txt", true);				// Creating FileWriter
					LogWriter.write(DateTime + "=> " + Module + " " + Message + "\n");		// Logs the message
					System.out.println(DateTime + "=> " + Module + " " + Message + "\n");	// Message is printed out for development
					LogWriter.close();
				} catch (IOException e) {
					System.out.println("An error occurred logging to file.");
					e.printStackTrace();
				}
			
			} else {
			
				try {
					LogWriter = new FileWriter("Logs/" + Date + ".txt", true);				// Creating FileWriter
					LogWriter.write(DateTime + "=> " + Module + " " + Message + "\n");		// Logs the message
					System.out.println(DateTime + "=> " + Module + " " + Message + "\n");	// Message is printed out for development
					LogWriter.close();
				} catch (IOException e) {
					System.out.println("An error occurred logging to file. Error message: " + e);
					e.printStackTrace();
				}
		
			}
			return true;
			
		} catch (IOException e) {
			System.out.println("An error occurred. Message: " + e);
			e.printStackTrace();
			return false;
		}
	
	}
	
}
