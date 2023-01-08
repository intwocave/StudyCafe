package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		System.out.println("잔액: " + account.getBalance());
				
		try {
			account.withdraw(30000);
		} catch(InsufficientMoney e) {
			System.out.println(e.getMessage());
		}
	}
}