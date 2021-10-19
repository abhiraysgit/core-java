package BasicOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		d = sf.parse("12/02/2000");

		Person1 n = new Person1("ankit", d, "bhopal");

		System.out.println(n.getName());
		System.out.println(n.getAddress());
		System.out.println(sf.format(n.getDob()));

	}
}
/*
 * public static void main(String[] args) throws ParseException { Date d=new
 * Date(); SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
 * d=sf.parse("12/02/2000"); Person1 n = new Person1(); n.setName("Ankit");
 * n.setAddress("Bhopal"); n.setDob(d); System.out.println(n.getName());
 * System.out.println(n.getAddress()); System.out.println(n.getDob()); }
 * 
 * }
 */