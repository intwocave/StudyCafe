package ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println(("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")"));

        System.out.println("t1: " + t1 + ", t2: " + t2);

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        // return (t1 == t2); 이건 값(primitive type)이 아니라 Wrapper type의 객체의 주소를 비교하기 때문에 false가 나온다.
        return (v1 == v2);
    }

    public static void main(String[] args) {
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }
}
