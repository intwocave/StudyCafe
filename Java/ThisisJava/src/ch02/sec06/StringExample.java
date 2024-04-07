package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String shourai_kibou = "코드싸개";
        String job = "백수";

        System.out.println(name + " " + shourai_kibou + '\t' + job);
        // System.out.println(name, shourai_kibou, job);
        // 쉼표로 공백입력 불가

        System.out.println("""
                안
                녕 하\
                세요""");
    }
}
