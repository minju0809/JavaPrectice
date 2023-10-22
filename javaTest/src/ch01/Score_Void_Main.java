package ch01;

import java.util.Scanner;

class Test {
	public void score(int score) {
		String grade = "A";
		if (score >= 90) {
			System.out.println("점수 : " + score + ", 등급 : " + grade);
		} else if (score >= 80) {
			grade = "B";
			System.out.println("점수 : " + score + ", 등급 : " + grade);
		} else {
			grade = "F";
			System.out.println("점수 : " + score + ", 등급 : " + grade + ", 응 넌 재시험");
		}
	}
}

public class Score_Void_Main {
	public static void main(String[] args) {
		Test test = new Test();

		// 조건문과 반복
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력해주세요. > ");
		int score = scanner.nextInt();
		test.score(score);

		scanner.close();
	}
}