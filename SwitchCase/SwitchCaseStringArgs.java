package SwitchCase;

public class SwitchCaseStringArgs {

	public static void main(String[] args) {

		int size = args.length;

		for (int i = 0; i < size; i++) {
			System.out.println("  Hello " + args[i]);
		}
	}

}
