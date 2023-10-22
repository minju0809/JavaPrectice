package ch01;

class Test4 {
	public void randomNum1() {
		// 난수
		int start = 1;
		int n = 45;
		for (int i = 1; i <= 30; i++) {
			int num = (int) (Math.random() * n) + start;
			if (num < 10) {
				System.out.printf("%02d ", num);
			} else {
				System.out.printf("%d ", num);
			}

			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	public void randomNum2() {
		// 난수, 배열, 카운트
		int count1 = 0;
		int count2 = 0;

		for (int i = 1; i <= 30; i++) {
			int random = (int) (Math.random() * 10);
			int age = (int) (Math.random() * 30) + 10; 
			String name[] = { "하니", "둘리", "세리", "네모", "다람쥐", "여우", "칠뜩이", "팔뜩이", "아이", "열라면" };
			
			String result = name[random] + " ";
			System.out.printf("%3s(%d)", result, age);

			if (name[random].equals("하니")) {
				count1++;
			} else {
				count2++;
			}

			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("=====================");
		System.out.printf("하니 : %s, 나머지 : %s \n", count1, count2);
	}
}

public class RandomNum_Void_Main {
	public static void main(String[] args) {
		Test4 test = new Test4();
		test.randomNum1();
		test.randomNum2();
	}
}
