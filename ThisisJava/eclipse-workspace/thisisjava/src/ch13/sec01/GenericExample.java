package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.content = "Hello, world!";
		System.out.println(box.content);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 1234;
		System.out.println(box2.content);
	}
}
