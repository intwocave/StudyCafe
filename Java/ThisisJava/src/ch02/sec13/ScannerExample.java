package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x값 입력: ");
        String input = sc.nextLine();
        int x = Integer.parseInt(input);

        System.out.println(x);

        while(true) {
            System.out.println("while 입력: ");
            String in = sc.nextLine();
            if (in.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + in);
        }

        System.out.println("종료");
    }
}
