package ch19.sec04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class NewsServer {
    private static DatagramSocket datagramSocket = null;

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("-------------------------------------------");

        // UDP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.nextLine();
            if(str.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        // UDP 서버 종료
        stopServer();
    }

    static void startServer() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true) {
                        byte[] buf = new byte[1024];
                        DatagramPacket packet = new DatagramPacket(buf, buf.length);
                        datagramSocket.receive(packet);

                        String str = new String(packet.getData(), 0, packet.getLength(), "UTF-8");

                        SocketAddress socketAddress = packet.getSocketAddress();
                        System.out.println("연결된 소켓 주소: " + socketAddress);

                        for(int i=1; i<=10; i++) {
                            String data = str + "뉴스 " + i;
                            DatagramPacket sendPacket =
                                    new DatagramPacket(data.getBytes(),
                                    0, data.getBytes().length, socketAddress);
                            datagramSocket.send(sendPacket);
                        }
                    }
                } catch (SocketException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    static void stopServer() {
        datagramSocket.close();
        System.out.println("[서버] 종료됨");
    }
}
