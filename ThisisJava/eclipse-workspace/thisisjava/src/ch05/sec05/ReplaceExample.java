package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = new String("Hello World!");
		String newStr = oldStr.replace("Hello", "Hell");
		
		System.out.println(newStr);
	}

}
