package test.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Vijay");
		a.add("Lacheta");
		Iterator it = a.iterator();
		//a.add("abhi");
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
		}
	}

}
