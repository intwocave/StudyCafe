package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        byte receiveData = -128;

        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);
    }
}
