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

	public SchoolVO school(SchoolVO vo) {
		vo.setName(vo.getName() + "님의 나이는 ");
		vo.setAge(vo.getAge() + 10);
		vo.setEmail(", 이메일은 " + vo.getEmail() + "@naver.com");
		return vo;
	}

	public NumberVO sum(NumberVO vo) {
		int num11 = Integer.parseInt(vo.getNum1());
		int num22 = Integer.parseInt(vo.getNum2());
		int sum = num11 + num22;
		vo.setResult(sum + "");
		return vo;
	}
}

public class MainClass {
	public static void main(String[] args) {
//		Test test = new Test();

		// accountBook
//		test.accountBook();

		// school
//		String name = "둘리";
//		int age = 15;
//		String email = "minju";
//
//		SchoolVO vo = new SchoolVO();
//
//		vo.setName(name);
//		vo.setAge(age);
//		vo.setEmail(email);
//
//		vo = test.school(vo);
//		System.out.println(vo.getName() + vo.getAge() + vo.getEmail());

//		String num1 = "10";
//		String num2 = "20";
//		
//		NumberVO vo = new NumberVO();
//		
//		vo.setNum1(num1);
//		vo.setNum2(num2);
//		
//		NumberVO result = test.sum(vo);
//		System.out.println(result.getResult());

		// String -> int
		String num1 = "100";
		int i = Integer.parseInt(num1);
		System.out.println(i);

		// int -> String
		int num2 = 20;
		int num3 = 40;
		String str1 = String.valueOf(num2);
		String str2 = String.valueOf(num3);
		System.out.println("int의 합: " + (num2 + num3));
		System.out.println("String을 추가하여 변환: " + num2 + num3);
		System.out.println("강제 형변환: " + str1 + str2);
	}
}