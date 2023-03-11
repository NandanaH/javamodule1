package ioserialization;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFind {

	public static void main(String[] args) throws IOException {
		System.out.println("entered  main");

		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("Nammadefile.txt");
		System.out.println("Enter same text");
		data = reader.readLine();
		while (data.equals("quit")) {
			
			writer.write(data);

			data = reader.readLine();
			//System.out.println("you have entered data..." + data);
		}
		writer.flush();
		writer.close();
		reader.close();
		
		System.out.println("main exited");
	}

}
