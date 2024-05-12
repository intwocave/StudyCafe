package ch05.sec03;

public class RefVarCompExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3, 4, 5};
        arr2 = new int[] {1, 2, 3, 4, 5};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }
}
