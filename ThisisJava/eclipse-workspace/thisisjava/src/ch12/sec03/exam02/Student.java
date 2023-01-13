package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int hashCode() {
		return no + name.hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			// Student target = (Student) obj;
			if (no == target.getNo() && this.getName() == target.getName()) {
				return true;
			}
		}
		return false;
	}
}
