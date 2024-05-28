package ch19.sec03.exam01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("-------------------------------------------------");

        // TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true) {
                        System.out.println("[서버] 요청을 기다리는 중..\n");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa =
                                (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " +
                                isa.getHostName() + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] " +
                                isa.getHostName() + "의 연결을 끊음");
                    }
                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        // 스레드 시작
        thread.start();
    }

    public static void stopServer() {
        try {
            // ServerSocket을 닫고 언바인딩
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
