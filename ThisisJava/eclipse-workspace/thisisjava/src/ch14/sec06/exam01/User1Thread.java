package ch14.sec06.exam01;

public class User1Thread extends Thread {
	private Calculator calc;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory1(100);
	}
}
