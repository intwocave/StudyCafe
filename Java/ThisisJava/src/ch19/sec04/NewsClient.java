package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;
import java.io.IOException;

public class NewsClient {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            DatagramPacket sendPacket = new DatagramPacket(str.getBytes(), 0,
                    str.getBytes().length, new InetSocketAddress("localhost", 50001));
            datagramSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);

            while(true) {
                datagramSocket.receive(receivePacket);
                String s = new String(receivePacket.getData(), 0,
                        receivePacket.getLength(), "UTF-8");
                System.out.println(s);
                if(s.contains("뉴스 10")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
