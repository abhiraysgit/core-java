package TestException;

public class Exceptionfinallyblock {
	public static void main(String[] args) {

		try {
			String a = null;
			System.out.println(a.length());
			System.out.println(a.charAt(8));
		} catch (NullPointerException a) {
			System.err.println("String nhi hai bhai");
			System.exit(87589);

		} catch (StringIndexOutOfBoundsException b) {
			System.err.println("string choti hai");
			System.exit(56);

		} finally {
			System.out.println("i am finally");
		}

	}
}
