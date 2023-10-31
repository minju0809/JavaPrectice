package ch02;

import java.util.Scanner;

public class AccountApplication {
	private static void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택> ");
	}

	private static int createAccount(Scanner scanner, Account[] accountArr, int accountCount) {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String num = scanner.nextLine();
		System.out.print("계좌주: ");
		String name = scanner.nextLine();
		System.out.print("초기입금액: ");
		int money = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < accountCount; i++) {
			if (num.equals(accountArr[i].getAccountNum())) {
				System.out.println("해당 계좌가 이미 존재합니다.");
				return accountCount;
			}
		}
		Account acount = new Account(num, name, money);
		accountArr[accountCount] = acount;
		accountCount++;
		System.out.println("결과: 계좌가 생성되었습니다.");

		return accountCount;
	}

	private static void listAccounts(Account[] accountArr, int accountCount) {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");

		for (int i = 0; i < accountCount; i++) {
			Account account = accountArr[i];
			System.out.println(
					account.getAccountNum() + " " + account.getAccountName() + " " + account.getAccountMoney());
		}
	}

	private static void deposit(Scanner scanner, Account[] accountArr, int accountCount) {
		System.out.println("------");
		System.out.println("입금");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String num = scanner.nextLine();

		for (int i = 0; i < accountCount; i++) {
			if (num.equals(accountArr[i].getAccountNum())) {
				System.out.print("입금액: ");
				int depositAmount = scanner.nextInt();
				scanner.nextLine();
				int currentBalance = accountArr[i].getAccountMoney();
				currentBalance += depositAmount;
	            accountArr[i].setAccountMoney(currentBalance);
				System.out.println("입금 완료. 현재 잔액: " + currentBalance);

				return;
			}
		}
		System.out.println("해당 계좌를 찾을 수 없습니다.");
	}

	private static void withdraw(Scanner scanner, Account[] accountArr, int accountCount) {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String num = scanner.nextLine();

		for (int i = 0; i < accountCount; i++) {
			if (num.equals(accountArr[i].getAccountNum())) {
				System.out.print("출금액: ");
				int withdrawAmount = scanner.nextInt();
				scanner.nextLine();
				int currentBalance = accountArr[i].getAccountMoney();
				if (withdrawAmount <= currentBalance) {
					currentBalance -= withdrawAmount;
					accountArr[i].setAccountMoney(currentBalance);
					System.out.println("출금 완료. 현재 잔액: " + currentBalance);
				} else {
					System.out.println("총액보다 출금하려는 금액이 더 큽니다.");
				}
				return;
			}
		}
		System.out.println("해당 계좌를 찾을 수 없습니다.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		Account[] accountArr = new Account[100];
		int accountCount = 0;

		while (run) {
			printMenu();
			int select = scanner.nextInt();
			scanner.nextLine();

			if (select == 1) {
				accountCount = createAccount(scanner, accountArr, accountCount);
			} else if (select == 2) {
				listAccounts(accountArr, accountCount);
			} else if (select == 3) {
				deposit(scanner, accountArr, accountCount);
			} else if (select == 4) {
				withdraw(scanner, accountArr, accountCount);
			} else if (select == 5) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("번호를 확인하고 다시 선택해주세요.");
			}
		}
		scanner.close();
	}
}
