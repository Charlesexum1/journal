/*
 * journal.java
 * 
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * Save your thoughts to .txt. 4.5.16
 * 
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class journal {
	
	private String newEntry;
	
	private void setEntry(){
		Scanner keys = new Scanner(System.in);
		newEntry = keys.next();
		}
	
	private void greetings(){
		System.out.println("Welcome to Journal.");
		System.out.println("You may record your thoughts to a text file.");
		}
		
	private void initializeTextOutput(){
		String recorder;
		Scanner keys = new Scanner(System.in);
		System.out.println("Do you wish to record this to a text? (y/n)");
		
		recorder = keys.next();
		
		switch (recorder)
		{
			case "y":
				System.out.println("enter today's date");
				String entryName = keys.next();
				PrintWriter outputStream = null;
				try
				{
					outputStream = new PrintWriter(entryName);
				}
				catch(FileNotFoundException e)
				{
					System.out.println("Error opening the file" + entryName);
					System.exit(0);
				}	
				outputStream.println(newEntry);
				outputStream.close();			
				System.out.println("saved to text");
				break;
			case "n":
				System.out.println("not saved");
				break;
			default:
				System.out.println("you didn't type y or n");
				break;
			}
		}	
	
	public static void main (String args[]) {
		
		journal demo = new journal();
		demo.greetings();
		demo.setEntry();
		demo.initializeTextOutput();	
				
	}
}








