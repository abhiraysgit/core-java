package synchronized_collection;

import java.nio.file.FileSystemNotFoundException;
import java.sql.DatabaseMetaData;

public class Account {
	private int balance = 0;

	public synchronized void deposite(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + "new balance " + bal);
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		databaseDelay();
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	public void databaseDelay() {
		try {
			Thread.sleep(200);

		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

}
