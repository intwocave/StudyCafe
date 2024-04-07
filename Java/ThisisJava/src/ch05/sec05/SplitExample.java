package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입,홍길동";

        String[] tokens = board.split(",");

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
