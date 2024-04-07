package ch05.sec07;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(array[2][0]);
        System.out.println(array.length);

        array = new int[][] {
                {1, 2, 3},
                {7, 8, 9},
                {4, 5, 6}
        };
        System.out.println(array[2][0]);
        System.out.println(array.length);

        array = new int[2][];
        array[0] = new int[] {109, 2, 3};
        array[1] = new int[] {445, 5, 6};
        System.out.println(array[1][0]);
        System.out.println(array.length);
    }
}
