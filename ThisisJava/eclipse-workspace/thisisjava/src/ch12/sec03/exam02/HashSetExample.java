package ch12.sec03.exam02;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student stu1 = new Student(1, "홍길동");
		Student stu2 = new Student(1, "홍길동");
		Student stu3 = new Student(1, "홍길통");
		hashSet.add(stu1);
		System.out.println(hashSet.size());
		
		hashSet.add(stu1);
		System.out.println(hashSet.size());
		hashSet.add(stu2);
		System.out.println(hashSet.size());
		hashSet.add(stu3);
		System.out.println(hashSet.size());
	}
}
