package ch01;

import java.util.Scanner;

class Test2 {
	public String score(int score) {
		String str = "";
		String grade = "A";
		if (score >= 90) {
			str = "점수 : " + score + ", 등급 : " + grade;
		} else if (score >= 80) {
			grade = "B";
			str = "점수 : " + score + ", 등급 : " + grade;
		} else {
			grade = "F";
			str = "점수 : " + score + ", 등급 : " + grade + ", 응 넌 재시험";
		}
		return str;
	}
}

public class Score_String_Main {
	public static void main(String[] args) {
		Test2 test = new Test2();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요. > ");

		int score = scanner.nextInt();
		String result = test.score(score);
		
		System.out.println(result);
		
		scanner.close();
	}
}
