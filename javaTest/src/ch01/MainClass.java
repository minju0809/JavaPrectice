package ch01;


class Test {
	public ScoreVO score(ScoreVO vo) {
		String str = "";
		String grade = vo.getGrade();
		int score = vo.getScore();
		if (score >= 90) {
			grade = "A";
			str = "점수 : " + score + "점, 등급 : " + grade;
		} else if (score >= 80) {
			grade = "B";
			str = "점수 : " + score + "점, 등급 : " + grade;
		} else if (score >= 70){
			grade = "C";
			str = "점수 : " + score + "점, 등급 : " + grade;
		} else {
			grade = "F";
			str = "점수 : " + score + "점, 등급 : " + grade + ", 재시험";
		}
		vo.setStr(str);
		return vo;
	}
}

public class MainClass {
	public static void main(String[] args) {
		Test test = new Test();
		
		int score = 60;		
		ScoreVO vo = new ScoreVO();
		vo.setScore(score);
		vo = test.score(vo);
		
		System.out.println(vo.getStr());
	}
}
