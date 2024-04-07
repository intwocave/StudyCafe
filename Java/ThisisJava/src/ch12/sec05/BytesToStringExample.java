package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {
    public static void main(String[] args) {
        String data = "자바";

        // String -> Byte arrays
        byte[] arr1 = data.getBytes();
        System.out.println(Arrays.toString(arr1));
        System.out.println(new String(arr1));
    }
}

