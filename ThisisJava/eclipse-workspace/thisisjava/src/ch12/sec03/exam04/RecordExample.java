package ch12.sec03.exam04;

public class RecordExample {
	public static void main(String[] args) {
		Member m = new Member("noontengyee", "눈탱이", 15);
		
		System.out.println(m.id() + ", " + m.name() + ", " + m.age());
		System.out.println(m); // = m.toString()
		System.out.println(m.hashCode());
		
		Member m2 = new Member("Hell0moko", "헬로모코", 25);
		System.out.println(m2.hashCode());
		
		Member m3 = new Member("noontengyee", "눈탱이", 15);
		System.out.println(m3.hashCode());
		
		System.out.println(m.equals(m3));
	}
}
