package ch13.sec04;

public class GenericExample {
	public static void main(String[] args) {
		boolean result = compare(9, 13.2);
		System.out.println(result);
	}
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		boolean result = (t1.doubleValue() == t2.doubleValue());
		
		return result;
	}
}
