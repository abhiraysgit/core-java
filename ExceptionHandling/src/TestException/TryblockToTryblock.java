package TestException;

public class TryblockToTryblock {
	public static void main(String[] args) {

		String s = "rays";
		try {

			try {
				System.out.println(s.length());
				System.out.println(s.charAt(3));

			} catch (StringIndexOutOfBoundsException A) {
				System.out.println("String choti hai bhai");

			}

		} catch (NullPointerException B) {
			System.out.println("String nhi hai bhai");

		}

		finally {
			System.out.println("I am finally");

		}
	}
}
