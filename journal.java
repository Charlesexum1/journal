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
	
	public static void main (String args[]) {
		
		String newEntry, recorder;
				
		System.out.println("record your thoughts.");
		Scanner keys = new Scanner(System.in);
		newEntry = keys.nextLine();
		System.out.println("you said: " + newEntry);
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
}








