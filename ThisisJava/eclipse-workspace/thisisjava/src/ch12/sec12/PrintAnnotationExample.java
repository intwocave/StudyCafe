package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		for(Method method : Service.class.getDeclaredMethods()) {
			PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnno);
			method.invoke(new Service());
			printLine(printAnno);
		}
	}
	
	public static void printLine(PrintAnnotation printAnno) {
		for(int i = 0; i < printAnno.number(); i++) {
			System.out.print(printAnno.value());
		}
		
		System.out.println();
	}
}