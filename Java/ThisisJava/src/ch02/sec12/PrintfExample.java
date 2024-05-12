package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        double value = 123.382;
        System.out.printf("%1$20.9f\n", value);

        String str = "Hello world";
        System.out.printf("%1$-20s", str);
    }
}
