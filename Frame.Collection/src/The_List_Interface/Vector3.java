package The_List_Interface;

import java.util.List;
import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		List b = new Vector();
		b.add("ajay");
		b.add(35);
		b.add(4.5);
		b.add('x');
		b.add("vijay");
		b.add(37);
		b.add(5.8);
		b.add('y');
		
		System.out.println(b);
	System.out.println(b.subList(3,7 ));
	}
}
