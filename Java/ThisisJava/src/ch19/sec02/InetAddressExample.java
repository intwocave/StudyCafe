package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 주소: " + local);

            InetAddress[] remote = InetAddress.getAllByName("www.google.com");
            System.out.println(" 구글 주소: \n");
            for(var a : remote) {
                System.out.println(a + "\n");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
