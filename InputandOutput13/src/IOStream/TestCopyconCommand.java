package IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestCopyconCommand {
	public static void main(String[] args) throws IOException {
		String target = "D:/Abhishek/hello.txt";
		FileWriter writer = new FileWriter(target);
	    PrintWriter printWriter = new PrintWriter(writer);
	    System.out.println("java");
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		String line = in.readLine();
		while (!line.equalsIgnoreCase("qUit")) {
			printWriter.print(line);
			line = in.readLine();

		}
		printWriter.close();
		isReader.close();
		System.out.println("done");
	}
}
