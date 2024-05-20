package ch17.sec01.exam01;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("손담비");
        set.add("전우치");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
