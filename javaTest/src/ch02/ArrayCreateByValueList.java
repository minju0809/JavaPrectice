package ch02;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		int[] scores = new int[] { 83, 90, 87 };

//		int sum = 0;
//		for (int i : scores) {
//			sum += i;
//			System.out.println(i);
//		}
//		System.out.println("sum: " + sum);
		
		printItem(scores);
	}
	public static void printItem (int[] scores) {
		int i = 0;
		int sum = 0;
		
		for (int s : scores) {
			System.out.println("scores[" + i + "]: " + s);
			i++;
			sum += s;
		}
		System.out.println("sum: " + sum);
	}
}
