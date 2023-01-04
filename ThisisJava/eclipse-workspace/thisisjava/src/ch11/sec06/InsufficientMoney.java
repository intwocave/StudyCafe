package ch11.sec06;

public class InsufficientMoney extends Exception{
	public InsufficientMoney() {}
	
	public InsufficientMoney(String msg) {
		super(msg);
	}
}
