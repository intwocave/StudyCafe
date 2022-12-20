package ch06.Question.Banking;

import java.util.Scanner;

public class BankApplication {
	static int totalAccount = 0;
	static Account[] acc = new Account[100];
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// acc[0] = new Account();
			// System.out.println(acc[0].getAsn());
			printMenu();
			String value = scan.nextLine();
			
			switch(Integer.parseInt(value)) {
				case 1: createAcc(); break;
				case 2: listAcc(); break;
				case 3: deposit(); break;
				case 4: withdrawal(); break;
				case 5: System.out.println("프로그램을 종료합니다."); System.exit(0);
				default: System.out.println("잘못된 값이 입력되었습니다.");
			}
		}
	}
	
	static void printMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");
		System.out.print("선택> ");
	}
	
	static void createAcc() {
		if (totalAccount < 100) {
			Scanner scan = new Scanner(System.in);
			String asn, name;
			int initMoney;
			
			System.out.println("--------");
			System.out.println("계좌생성");
			System.out.println("--------");
			System.out.print("계좌번호: ");
			asn = scan.nextLine();

			for(int i = 0; i < totalAccount; i++) {
				if (acc[i].getAsn().equals(asn)) {
					System.out.println("계좌가 이미 존재합니다.");
					return;
				}
			}
			
			//acc[totalAccount].setAsn(scan.nextLine());
			System.out.print("계좌주: ");
			name = scan.nextLine();
			//acc[totalAccount].setName(scan.nextLine());
			System.out.print("초기입금액: ");
			initMoney = Integer.parseInt(scan.nextLine());
			//acc[totalAccount].setMoney(Integer.parseInt(scan.nextLine()));
			
			acc[totalAccount] = new Account(asn, name, initMoney);
			
			System.out.print("결과: ");
			if (acc[totalAccount] != null) {
				System.out.println("계좌가 생성되었습니다.");
				totalAccount++;
			} else {
				System.out.println("계좌 생성에 실패하였습니다.");
			}
		} else {
			System.out.println("생성할 수 있는 계좌의 총 개수에 도달했습니다.");
		}
	}
	
	static void listAcc() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(int i = 0; i < totalAccount; i++) {
			System.out.println(acc[i].getAsn() + '\t' + acc[i].getName() + '\t' + acc[i].getMoney());
		}
	}
	
	static void deposit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String asn = scan.nextLine();
		for(int i = 0; i < totalAccount; i++) {
			if (acc[i].getAsn().equals(asn)) {
				System.out.print("예금액: ");
				acc[i].deposit(Integer.parseInt(scan.nextLine()));
				System.out.println("성공적으로 예금했습니다.");
				
				return;
			}
		} System.out.println("해당 계좌를 찾을 수 없습니다.");
	}
	
	static void withdrawal() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String asn = scan.nextLine();
		for(int i = 0; i < totalAccount; i++) {
			if (acc[i].getAsn().equals(asn)) {
				System.out.print("출금액: ");
				acc[i].withdraw(Integer.parseInt(scan.nextLine()));
				System.out.println("성공적으로 출금했습니다.");
				
				return;
			}
		}
		System.out.println("해당 계좌를 찾을 수 없습니다.");
	}
}
