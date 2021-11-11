package IOStream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestFile {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D:/Abhishek/hello.txt");
		PrintWriter pw = new PrintWriter(writer);
		for (int i = 0; i < 5; i++) {
			pw.print(i + ":Line");
		}
		pw.close();
		writer.close();
		System.out.println("File is successfully written,PI checkD:/Abhishek");
	}
}
