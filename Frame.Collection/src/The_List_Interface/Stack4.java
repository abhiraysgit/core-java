package The_List_Interface;

import java.util.Stack;

public class Stack4 {
	public static void main(String[] args) {

		Stack e = new Stack();
		e.push("Mohan");
		e.push("Nayak");
		e.push(232);
		e.push(5.67);
		e.push('H');
		e.push("Ankit");
		e.push("lacheta");
		e.push(532);
		e.push(5.447);
		e.push('R');
		e.pop();
		e.pop();
		e.pop();

		System.out.println(e);
		System.out.println(e.indexOf(232));

	}

}
