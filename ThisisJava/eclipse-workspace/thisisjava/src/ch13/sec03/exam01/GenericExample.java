package ch13.sec03.exam01;

public class GenericExample {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		
		return box;
	}
	
	public static void main(String[] args) {
		Box<String> box = boxing("Hello");
		System.out.println(box.get());
	}
}
