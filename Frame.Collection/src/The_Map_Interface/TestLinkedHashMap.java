package The_Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map l = new LinkedHashMap();
		l.put(1, 23);
		l.put(2, 24);
		l.put(3, "Himansu");
		l.put(4, "soni");
		l.put(5, 'D');

		System.out.println(l);
		System.out.println(l.entrySet());

		System.out.println(l.get(3));
		System.out.println(l.size());
	}
}
