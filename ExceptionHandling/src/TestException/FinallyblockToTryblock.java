package TestException;

public class FinallyblockToTryblock {
	public static void main(String[] args) {

		String n = "vijay";
		try {

		} finally {

			try {
				System.out.println(n.length());
				System.out.println(n.charAt(7));
			} catch (StringIndexOutOfBoundsException A) {
				System.out.println("String choti hai bhai");
			} catch (NullPointerException b) {
				System.out.println("String nhi hai");
			}
		}

	}
}