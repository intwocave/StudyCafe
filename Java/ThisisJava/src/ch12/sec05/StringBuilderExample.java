package ch12.sec05;

import java.util.StringTokenizer;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append(8382)
                .append("안녕하세요")
                .append("Hello")
                .replace(0,0,"Hello")
                .toString();
        System.out.println(data);

        String str = "홍길동&이수홍&박연수,김명수/리준팍";

        for (String s : str.split("&|,|/")) {
            System.out.print(s + ", ");
        }

        String a = new StringTokenizer(str,"&").nextToken();
        System.out.println(a);
    }
}
