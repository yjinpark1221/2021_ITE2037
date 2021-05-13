package selfTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HasNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			
			inputStream = new Scanner(new FileInputStream("resource\\BladeRunner.txt"));
			outputStream = new PrintWriter(new FileOutputStream("resource\\BladeRunner.txt"));
			
			/* Input File Location Example: resource\\BladeRunner.txt */
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}
		
		String line = null;
		
		for (int cnt = 1; inputStream.hasNextLine(); ++cnt) {
			line = inputStream.nextLine();
			outputStream.println(cnt + " " + line);
		}
		
		inputStream.close();
		outputStream.close();
	}

}
