package ch16.sec01;

import ch14.sec06.exam01.Calculator;

public class LambdaExample {
    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println(result);
        });
    }

    public static void action(Calculable calc) {
        int a = 10;
        int b = 4;
        calc.calc(a, b);
    }
}
