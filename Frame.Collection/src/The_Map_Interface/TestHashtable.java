package The_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class TestHashtable {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(0, "Abhi");
		m.put(1, "kag");
		m.put(2, "raja");
		m.put(3, "Hero");
		m.put(4, "barfa");
		m.put(5, "Tina");
		
		System.out.println(m.keySet());
		System.out.println(m);
		System.out.println(m.isEmpty());
		
		System.out.println(m.containsValue("Abhi"));
		System.out.println(m.containsKey(6));
	}

}
