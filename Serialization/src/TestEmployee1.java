import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployee1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("D:/Ajay.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		Employee emp = (Employee) in.readObject();
		System.out.println("ID:" + emp.getId());
		System.out.println("F Name:" + emp.getFirstName());
		System.out.println("L Name:" + emp.getLastName());
		System.out.println("Temp value:" + emp.getTempValue());

	}
}
