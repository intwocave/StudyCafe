package ch11.sec06;

public class Account {
    private long balance;

    public long getBalance() {
        return this.balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long val) throws InsufficientException {
        if (this.balance < val) {
            throw new InsufficientException("Insufficient balance");
        } else {
            this.balance -= val;
        }
    }
}
