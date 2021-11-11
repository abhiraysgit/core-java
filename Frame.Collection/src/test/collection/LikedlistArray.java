package test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LikedlistArray {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add("vijay");
		list.add(3.44);
//		list.clear();
		System.out.println(list);

		System.out.println(list.contains(12));

		ArrayList a = new ArrayList();
		a.add(12);
		a.add("rani");
		a.add(3.55);
		a.add("lacheta");
		a.remove(3);
		a.addAll(list);
	
		// a.removeAll(a);
		System.out.println(a);
		System.out.println(a.size());
	//System.out.println(a.retainAll(a));

		

	System.out.println(a.isEmpty());
		System.out.println(a.containsAll(list));
		

	}

}
