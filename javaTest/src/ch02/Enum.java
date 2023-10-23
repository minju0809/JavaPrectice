package ch02;

import java.util.Scanner;

public class Enum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		EnumDrink drink = null;
		while (run) {
			System.out.print("1~5번 중 번호 선택> ");
			int choiceDrink = scanner.nextInt();

			switch (choiceDrink) {
			case 1:
				drink = EnumDrink.WATER;
				break;
			case 2:
				drink = EnumDrink.COFFEE;
				break;
			case 3:
				drink = EnumDrink.TEA;
				break;
			case 4:
				drink = EnumDrink.SODA;
				break;
			case 5:
				drink = EnumDrink.JUICE;
				break;
			default : 
				System.out.println("1~5번 중에 다시 선택해주세요");
				continue;
			}
			System.out.println(drink);
			run = false;
		}

		scanner.close();
	}
}
