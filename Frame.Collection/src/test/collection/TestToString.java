package test.collection;

import java.util.ArrayList;
import java.util.List;

public class TestToString {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("one");
		l.add("Two");
		l.add("Three");
		l.add("Four");
           // l.size();
            for (Object s : l) {
			System.out.println(l+":"+s.toString());	
			}
			}
		
	}


