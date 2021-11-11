package The_List_Interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
	public static void main(String[] args) {
		List a = new LinkedList();
		a.add("vipin");
		a.add(15);
		a.add("bhopal");
		a.add('A');
		a.add(3.55);
		// a.remove(3);
		a.set(1, "abhi");
		System.out.println(a);
		// System.out.println(a.set(1, "abhi"));

		System.out.println(a.remove(3));
	}

}
