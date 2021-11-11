package test.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("abhishek");
		v.add("kag");
		Enumeration e = v.elements();
		v.add(34);
		System.err.println(v);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		}
	}


