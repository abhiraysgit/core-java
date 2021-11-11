package TestException;

public class InsufficientBalance extends Exception {

	static String string = "बैलेंस नाही है";

	public InsufficientBalance() {
		super("Insufficient Balance!! pese nhi hain bhai aur dalo!" + string);
	}

}
