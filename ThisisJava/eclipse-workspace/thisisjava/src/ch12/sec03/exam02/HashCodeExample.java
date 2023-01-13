package ch12.sec03.exam02;

public class HashCodeExample {
	public static void main(String[] args) {
		Student stu1 = new Student(1, "홍길동");
		Student stu2 = new Student(1, "홍길동");
		Student stu3 = new Student(2, "홍길동");
		
		if (stu1.hashCode() == stu3.hashCode()) {
			System.out.println("해쉬코드가 같습니다.");
			if (stu1.equals(stu3)) {
				System.out.println("데이터가 같으므로 동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해쉬코드가 다르므로, 동등 객체가 아닙니다.");
		}
	}
}
