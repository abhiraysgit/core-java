package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyBinary {
	public static void main(String[] args) throws Exception {
		String source="D:/sriya.jpg";
		String target ="D:/gagan.jpg";
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		int ch = reader.read();
		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();

		}
		writer.close();
		reader.close();
		System.out.println(source + "is copied to" + target);

	}
}

