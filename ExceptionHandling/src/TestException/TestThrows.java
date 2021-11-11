package TestException;

public class TestThrows {

	public static void main(String[] args) {
			try {
				TestThrows.authenticate();
			} catch (InsufficientBalance e) {
				e.printStackTrace();
			}
			}

	public static void authenticate() throws InsufficientBalance {
		int i = 1000;
		if (i < 10000) {
			InsufficientBalance exception = new InsufficientBalance();
			throw exception;
		}
	}
}
