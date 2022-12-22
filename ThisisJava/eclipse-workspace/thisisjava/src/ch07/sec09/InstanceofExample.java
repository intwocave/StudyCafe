package ch07.sec09;

public class InstanceofExample {
	public static void main(String[] args) {
		Person person = new Person("Gildong");
		
		info(person);
	}	
	
	public static void info(Person person) {
		System.out.println("Name: " + person.name);
		
		if (person instanceof Student) {
			Student stu = (Student) person;
			System.out.println(stu.name + " is student.");
			System.out.println("His Student ID is " + stu.stuID);
			stu.study();
		}
	}
}