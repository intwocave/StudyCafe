package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        int result = 10 + 2 + 8;
        System.out.println(result);

        String result1 = 10 + "2" + 8;
        System.out.println(result1);

        String result2 = "10" + 2 + 8;
        System.out.println(result2);

        String result3 = "10" + (2 + 8);
        System.out.println(result3);
    }
}
