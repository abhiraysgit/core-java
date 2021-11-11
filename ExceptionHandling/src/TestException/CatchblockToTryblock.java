package TestException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CatchblockToTryblock {
	public static void main(String[] args) {
		String s = "null";
		try {

			System.out.println(s.length());
			System.out.println(s.charAt(6));

		} catch (StringIndexOutOfBoundsException A) {
			System.out.println("string choti hai");
		} catch (NullPointerException F) {
			System.out.println("String nhi hai");
			try {

			} finally {
				System.out.println("i am finally");
			}

		}

	}
}
