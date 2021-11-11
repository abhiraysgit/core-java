package The_Queue_Interface;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestLinkedList {
	public static void main(String[] args) {
		Queue q = new LinkedBlockingDeque();
		q.offer("Abhi");
		q.offer("Lacheta");
		q.offer("Rani");
		q.offer(234);
		q.offer(675.6547);
		q.add("jbvdj");
		q.add('f');
		System.out.println(q);
	
		System.out.println(q.peek());
		q.remove(234);
		System.out.println(q);
	
		System.out.println(q.poll());
	}

}
