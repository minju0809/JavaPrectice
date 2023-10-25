package ch02;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		Account[] accountArr = new Account[100];

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

				boolean d = false;
				int count = 0;

				for (int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null) {
						count += 1;
						if (num.equals(accountArr[i].accountNum)) {
							d = true;
						}
					}
				}
				if (d) {
					System.out.println("동일 번호의 계좌번호가 있습니다.");
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
					if (accountArr[i] != null) {
						accountList += accountArr[i].accountNum + " " + accountArr[i].accountName + " "
								+ accountArr[i].accountMoney + "\n";
					}
				}
				System.out.println(accountList);
			} else if (select == 3) {
				System.out.println("------");
				System.out.println("입금액");
				System.out.println("------");

				System.out.print("계좌번호: ");
				num = scanner.nextLine();
				for (int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null && num.equals(accountArr[i].accountNum)) {
						System.out.print("입금액: ");
						money = scanner.nextInt();
						totalMoney += money;
						accountArr[i].setAccountMoney(totalMoney);
					}
//					else {
//						System.out.println("계좌번호가 다릅니다.");
//					}
				}
			} else if (select == 4) {
				System.out.println("------");
				System.out.println("출금액");
				System.out.println("------");
//
				System.out.print("계좌번호: ");
				num = scanner.nextLine();
				for (int i = 0; i < accountArr.length; i++) {

					if (accountArr[i] != null && num.equals(accountArr[i].accountNum)) {
						System.out.print("출금액: ");
						money = scanner.nextInt();

						if (money > totalMoney) {
							System.out.println("계좌 총 금액보다 출금하려는 금액이 큽니다.");
						} else {
							totalMoney -= money;
							accountArr[i].setAccountMoney(totalMoney);
						}
					}
//					else {
//						System.out.println("계좌번호가 다릅니다.");
//					}
				}
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.println("번호를 확인 후 다시 선택해주세요.");
			}
		}
		scanner.close();
	}
}
