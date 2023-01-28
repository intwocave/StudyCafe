package ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		User1Thread user1 = new User1Thread();
		User2Thread user2 = new User2Thread();
		Calculator calc  = new Calculator();
		
		user1.setCalc(calc);
		user2.setCalc(calc);
		
		user1.start();
		user2.start();
	}
}
