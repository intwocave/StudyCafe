package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {
        Method[] declaredMehotds = Service.class.getDeclaredMethods();
        for (Method method : declaredMehotds) {
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            printLine(printAnnotation);
            try {
                method.invoke(new Service());
            } catch (IllegalAccessException | InvocationTargetException e) {}

            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            int num = printAnnotation.number();
            for(int i = 0; i < num; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}