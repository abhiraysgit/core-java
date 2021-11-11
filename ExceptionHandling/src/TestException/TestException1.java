package TestException;

public class TestException1 {
	public static void main(String[] args) {

		String S = "JavaTech";
		try {

			System.out.println(S.length());
			System.out.println(S.charAt(4));
		} catch (NullPointerException A) {
			System.out.println("String abhi choti hai mere bhai ");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Abhi choti hai mere bro");

		} finally {
			System.out.println("I am finally ");
		}
	}
}
