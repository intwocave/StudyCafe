package ch07.sec09;

public class Student extends Person{
	String stuID;
	
	Student(String name, String ID) {
		super(name);
		this.stuID = ID;
	}
	
	public void study() {
		System.out.println("Studying..");
	}
}