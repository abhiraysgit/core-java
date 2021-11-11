package BasicOOP;

public class AccountTest {
	public static void main(String[] args) {
		/*
		 * Account a = new Account("saving account", "897440450000567", 20345.2340);
		 * System.out.println(a.getAccountType()); System.out.println(a.getNumber());
		 * System.out.println(a.getBalance());
		 */

		Account a = new Account();
		a.setNumber("897440450000567");

		a.setAccountType("saving account");
		a.setBalance(20345.2340);
//		System.out.println(a.getNumber());
//		System.out.println(a.getAccountType());
//		System.out.println(a.getBalance());
		// System.out.println();
		// a.deposit(700);
		a.withdrawal(20000);
//		a.funTransfer(2500);
//		a.payBill(5000);
//		System.out.println();
		System.out.print("Remaining Balance......" + a.getBalance());

	}

}
