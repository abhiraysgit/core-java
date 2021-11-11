import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("D:/Ajay.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		Employee emp = new Employee(10, "Vijay", "Sharma");
		out.writeObject(emp);
		out.close();
		System.out.println("Object is successfully persisted");
	}
}