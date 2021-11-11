package Exercise_11_8;

import java.util.Stack;

public class AtoZ_8 {
	public static void main(String[] args) {
		Stack a = new Stack();
		Stack b = new Stack();
		for (char i = 'A'; i <= 'Z'; i++) {
			a.push(i);

		}
		System.out.println(a);
		for (int i = a.size(); i > 0; i--) {
			b.push(a.pop());

		}
		System.out.println(b);
		for (int i =b.size(); i >0; i--) {
			b.pop();
			
		}
		System.out.println(b);
	}

}
