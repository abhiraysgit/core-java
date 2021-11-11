package BasicOOP;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 0.00;

	/*
	 * // using constructor public Account(String number, String accountType, double
	 * balance) { this.number = number; this.accountType = accountType; this.balance
	 * = balance;
	 */

	/*
	 * }
	 */
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double d) {
		balance = balance + d;
		System.out.println("Deposit +" + d);
	}

	public void withdrawal(double w) {

		if ((balance - w) < 300) {
			Insufficiantfund a = new Insufficiantfund();
			try {
				throw a;

			} catch (Exception e) {
				System.err.println(a.getMessage());
			}

		} else {
			balance = balance - w;
			System.out.println("Succesfull your withdrowl " + w);
		}

	}

	public void funTransfer(double f) {
		balance = balance - f;
		System.out.println("funTransfer -" + f);
	}

	public void payBill(double p) {
		balance = balance - p;
		System.out.println("payBill -" + p);
	}

}
