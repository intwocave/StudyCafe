package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // Java 12부터 가능
        int score = switch(grade) {
            case "A", "a" -> 100;
            case "B", "b" -> 200;
            case "C", "c" -> 300;
            default -> 0;
        };

        System.out.println(score);
    }
}
