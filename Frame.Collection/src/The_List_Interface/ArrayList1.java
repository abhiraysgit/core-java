package The_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {

		List a = new ArrayList();
		a.add(10);
		a.add("abhi");
		a.add(3.4);
		a.add(1, 2.4);
		System.out.println(a.get(1));

	}
}
