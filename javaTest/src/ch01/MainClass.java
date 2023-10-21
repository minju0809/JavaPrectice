package ch01;

import java.util.Scanner;

class Test {
	public void accountBook() {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int money = 0;

		while (run) {
			System.out.println("=================================");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================================");
			System.out.print("선택> ");

			int select = scanner.nextInt();
			int value;

			if (select == 1) {
				System.out.print("입금액> ");
				value = scanner.nextInt();
				money += value;
			} else if (select == 2) {
				System.out.print("출금액> ");
				value = scanner.nextInt();
				if (value > money) {
					System.out.println("잔고보다 출금하려는 금액이 큽니다.");
				} else {
					money -= value;
				}
			} else if (select == 3) {
				System.out.println("잔고>" + money);
			} else if (select == 4) {
				run = false;
			} else {
				System.out.println("1, 2, 3, 4번 중에서 선택해주세요.");
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Test test = new Test();
		test.accountBook();
	}
}