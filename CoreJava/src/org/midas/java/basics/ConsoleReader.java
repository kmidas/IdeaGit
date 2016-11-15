package org.midas.java.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleReader {

	public static void main(String args[]) {

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\kamaldeep\\Downloads\\A-small-practice.in"));
			int lineCounter = 0; 
			String currentLine = br.readLine();
			while((currentLine = br.readLine()) != null) {
				System.out.print(currentLine );
				System.out.println("     Case#" + lineCounter + ":" + getFriends(currentLine)); 
				lineCounter++; 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getFriends (String str){
		
		String friends = str.substring(2);
		char shynessLevel = friends.charAt(friends.length()-1); 
		
		
	
		
		return friends; 
	}
}
