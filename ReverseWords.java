import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ReverseWords {
	public static void main(String[] args) {
		final String testFile = "B-small-practice.in"; // specify input file here
		Scanner fileInput; 
	
		// connect Scanner to input file
		try {
			fileInput = new Scanner(new File(testFile)); 
		}
		catch (IOException exc) {
			System.out.println("That filename didn't work.");
			return;
		}
		// for printing results to an output file
		PrintStream output;
		try {
			output = new PrintStream(new File("B-small-practice.out"));	
		}
		catch (FileNotFoundException e) {
			System.out.println("Unable to print results to file.");
			return;
		}
		
		// get number of cases (lines to reverse)
		int cases = fileInput.nextInt();
		fileInput.nextLine(); // to consume newline char
		
		for (int i = 0; i < cases; i++) {
			String nextLine = fileInput.nextLine(); // store next line as string
			Scanner data = new Scanner(nextLine); // create scanner for that string
		
			ArrayList<String> list = new ArrayList<String>(); // create ArrayList of strings
			while (data.hasNext()) { // until string has no more tokens
				list.add(0, data.next()); // add each successive token to beginning of list
			}
			
			// print output to console - 
			System.out.print("Case #" + (i+1) + ":");
			for (int j = 0; j < list.size(); j++) {
				System.out.print(" " + list.get(j));
			}
			System.out.println();
			
			// print output to file
			output.print("Case #" + (i+1) + ":");
			for (int j = 0; j < list.size(); j++) {
				output.print(" " + list.get(j));
			}
			output.println();
		
		}	
	}
}