package ch11.sec06;

public class Account {
	private long balance;
	
	Account () {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientMoney {
		if (balance < money) {
			throw new InsufficientMoney("InsufficientMoney - balance: " + balance);
		} else {
			balance -= money;
		}
	}
}
