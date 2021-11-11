package The_Deque_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
	public static void main(String[] args) {
		Deque d = new ArrayDeque();
		d.add(24);
		d.addFirst("pyl");
		d.add('r');
		d.add(23.566);
		d.offerLast("mukati");
		d.add(5678);
		d.add(7879.6788);
		d.offerFirst("Abhi");
		d.addFirst("shivani");

		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.pollFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.pollLast();
		System.out.println(d);

		// System.out.println(d.getFirst());
		System.out.println(d.peekFirst());
		System.out.println(d.getLast());
		System.out.println(d.peekLast());
	}

}
