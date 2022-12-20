package ch06.Question.Banking;

public class Account {
	private int money;
	private String asn, name;
	
	// Account() {}
	
	Account(String asn, String name, int money) {
		this.asn = asn;
		this.name = name;
		this.money = money;
	}
	
	String getAsn() {
		return asn;
	} void setAsn(String asn) {
		this.asn = asn;
	}
	
	String getName() {
		return name;
	} void setName(String name) {
		this.name = name;
	}
	
	int getMoney() {
		return money;
	} void setMoney(int money) {
		this.money = money;
	} void deposit(int money) {
		this.money += money;
	} void withdraw(int money) {
		this.money -= money;
	}

}
