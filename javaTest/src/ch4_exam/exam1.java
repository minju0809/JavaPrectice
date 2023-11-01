package ch4_exam;

import java.util.Calendar;
import java.util.Random;

// 2-1.
class PlusMinus {
	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}
}

// 2-5.
class Tire {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire {
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

// 2-6.
class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B");
	}
}

public class exam1 {
	public static void main(String[] args) {
		// 1-1. while 문으로 1~10까지의 합 구하
		int hap = 0, count = 1;

		while (count <= 10) {
			hap += count;
			count++;
		}
		System.out.println("1부터 10까지의 합은 " + hap + "입니다.");
		System.out.println("================================================");

		// 1-2. for 문으로 1~10까지의 합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
		}
		System.out.println("\n---------------");
		System.out.println(sum);
		System.out.println("================================================");
		
		// 1-3. for 문과 while 문으로 구구단 출력
		for (int dan = 2; dan < 10; dan++) {
			int g = 1;
			while (g <= 9) {
				System.out.printf("%sX%s=%2s ", dan, g, (dan*g));
				g++;
			}
			System.out.println();
		}
		System.out.println("================================================");
		
		// 2-1. 합과 차 구하는 프로그램 작성
		PlusMinus m = new PlusMinus();
		int k1 = m.plus(10, 5);
		System.out.println(k1);

		int k2 = m.minus(10, 5);
		System.out.println(k2);
		System.out.println("================================================");
		
		// 2-2. 형변환하여 결과 도출
		String ii = "111";
		String jj = "222";

		int k = Integer.parseInt(ii) + Integer.parseInt(jj);

		System.out.println(k);
		System.out.println("================================================");
		
		// 2-3. 0~5 사이의 난수 출력
		Random random = new Random();
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(6);
			System.out.print(num + " ");
			if (num == 1) {
				i1++;
			} else if (num == 2) {
				i2++;
			} else if (num == 3) {
				i3++;
			} else {
				i4++;
			}
		}
		System.out.println("\n1의 개수는: " + i1 + " 개 입니다. ");
		System.out.println("2의 개수는: " + i2 + " 개 입니다. ");
		System.out.println("3의 개수는: " + i3 + " 개 입니다. ");
		System.out.println("기타 숫자의 개수는: " + i4 + " 개 입니다. ");
		System.out.println("================================================");
		
		// 2-4. Calendar 프로그램 완성하기
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);

		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println("================================================");
		
		// 2-5. 결과값
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run(); // 스노우 타이어가 굴러갑니다.
		tire.run(); // 스노우 타이어가 굴러갑니다.
		System.out.println("================================================");
		
		// 2-6. 결과값
		new B(); // A B
	}
}
