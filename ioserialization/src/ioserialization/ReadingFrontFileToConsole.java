package ioserialization;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadingFrontFileToConsole {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\Ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.javaS");
		BufferedReader buffer = new BufferedReader(reader);

		String data = buffer.readLine();
		while (data != null)
			;
		{
			System.out.println(data);
			data = buffer.readLine();

		}

		reader.close();
		buffer.close();
	}
}
