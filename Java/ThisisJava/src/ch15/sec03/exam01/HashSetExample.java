package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("MelonMusK");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        System.out.println(set.size());
    }
}
