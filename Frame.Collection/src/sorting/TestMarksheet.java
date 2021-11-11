package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet extends Marksheet {

	private static final String Collection = null;

	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setRollnumber("1125");
		m1.setFname("vijay");
		m1.setLname("chouhan");
		m1.setChe(63);
		m1.setPhys(48);
		m1.setMat(90);

		Marksheet m2 = new Marksheet();
		m2.setRollnumber("1123");
		m2.setFname("Ajay");
		m2.setLname("chouhan");
		m2.setChe(65);
		m2.setPhys(58);
		m2.setMat(60);

		Marksheet m3 = new Marksheet();
		m3.setRollnumber("1122");
		m3.setFname("Raja");
		m3.setLname("barfa");
		m3.setChe(65);
		m3.setPhys(45);
		m3.setMat(95);

		Marksheet m4 = new Marksheet();
		m4.setRollnumber("1124");
		m4.setFname("Aavesh");
		m4.setLname("khan");
		m4.setChe(84);
		m4.setPhys(98);
		m4.setMat(33);

		Marksheet m5 = new Marksheet();
		m5.setRollnumber("1121");
		m5.setFname("Shivani");
		m5.setLname("Dongre");
		m5.setChe(87);
		m5.setPhys(98);
		m5.setMat(67);
		ArrayList list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		//OrderByName a = new OrderByName();

		Collections.sort(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Marksheet o = (Marksheet) it.next();
			System.out.println(o.getRollnumber() + " " + o.getFname() + " " + o.getLname() + " " + o.getChe() + " "
					+ o.getPhys() + " " + o.getMat());
		}
	}
}
