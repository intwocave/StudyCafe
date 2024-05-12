package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account myAccount = new Account();

        try {
            myAccount.deposit(1000);
            myAccount.withdraw(500);
        } catch (InsufficientException e) {
            // System.out.println(e.getMessage());
            e.getStackTrace();
        } finally {
            System.out.println("Owari");
        }

    }
}
