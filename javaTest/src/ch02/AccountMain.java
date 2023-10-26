package ch02;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Account[] accountArr = new Account[100];

		boolean run = true;
		int select = 0;

		String num = "";
		String name = "";
		int money = 0;
		int totalMoney = 0;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			select = scanner.nextInt();
			scanner.nextLine();

			if (select == 1) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");

				System.out.print("계좌번호: ");
				num = scanner.nextLine();
				System.out.print("계좌주: ");
				name = scanner.nextLine();
				System.out.print("초기입금액: ");
				money = scanner.nextInt();
				totalMoney = money;
				
				int count = 0;
				boolean duplication = false;

				for (int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null) {
						count += 1;
						if (num.equals(accountArr[i].getAccountNum())) {
							duplication = true;
						}
					}
				}
				if (duplication) {
					System.out.println("해당 계좌가 이미 존재합니다.");
				} else {
					Account vo = new Account();
					vo.setAccountNum(num);
					vo.setAccountName(name);
					vo.setAccountMoney(totalMoney);

					accountArr[count] = vo;
					System.out.println("결과: 계좌가 생성되었습니다.");
				}
			} else if (select == 2) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");

				String accountList = "";

				for (int i = 0; i < accountArr.length; i++) {
					Account array = accountArr[i];
					if (accountArr[i] != null) {
						accountList += array.getAccountNum() + " " + array.getAccountName() + " " + array.getAccountMoney() + "\n";
					}
				}
				System.out.println(accountList);
			} else if (select == 3) {
				System.out.println("------");
				System.out.println("입금");
				System.out.println("------");

				System.out.print("계좌번호: ");
				num = scanner.nextLine();

				for (int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null && num.equals(accountArr[i].getAccountNum())) {
						System.out.print("입금액: ");
						money = scanner.nextInt();
						totalMoney += money;
						accountArr[i].setAccountMoney(totalMoney);
					}
				}
//				System.out.println("해당 계좌를 찾을 수 없습니다.");
			} else if (select == 4) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");

				System.out.print("계좌번호: ");
				num = scanner.nextLine();

				for (int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null && num.equals(accountArr[i].getAccountNum())) {
						System.out.print("출금액: ");
						money = scanner.nextInt();
						if (money > totalMoney) {
							System.out.println("출금액이 너무 큽니다.");
						} else {
							totalMoney -= money;
							accountArr[i].setAccountMoney(totalMoney);
						}
					}
				}
			} else if (select == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

		scanner.close();
	}
}
