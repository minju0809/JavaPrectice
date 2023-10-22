package ch01;

import java.util.Scanner;

class Test3 {
	public ScoreVO score(ScoreVO vo) {
		int score = vo.getScore();
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
		vo.setStr(str);
		return vo;
	}
}

public class Score_VO_Main {
	public static void main(String[] args) {
		ScoreVO svo = new ScoreVO();
		Test3 test = new Test3();
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력해주세요. > ");
		int score = scanner.nextInt();
		svo.setScore(score);
		ScoreVO m = test.score(svo);
		System.out.println(m.getStr());

		scanner.close();
	}
}
