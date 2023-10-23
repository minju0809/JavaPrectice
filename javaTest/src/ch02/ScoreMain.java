package ch02;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		int[] array = {};
		
		int score = 0;
		double sum = 0;
		double avg = 0;

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");

			int select = scanner.nextInt();

			if (select == 1) {
				System.out.print("학생 수: ");
				student = scanner.nextInt();
				array = new int[student];
			} else if (select == 2) {
				for (int i = 0; i < array.length; i++) {
					System.out.print("score [" + i + "]: ");
					score = scanner.nextInt();
					array[i] += score;
					sum += score;
					avg = sum / student;
				}
			} else if (select == 3) {
				for (int i : array) {
					System.out.print(i + " \n");
				}
			} else if (select == 4) {
				int max = array[0];
				for (int i : array) {
					if (max < i) {
						max = i;
					}
				}
				System.out.printf("총합: %.0f, 평균 %.1f, 최고점수: %d \n", sum, avg, max);
			} else if (select == 5) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("번호를 다시 선택해주세요.");
			}
		}
		scanner.close();
	}
}
