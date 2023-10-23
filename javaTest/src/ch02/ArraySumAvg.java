package ch02;

public class ArraySumAvg {

	public static void main(String[] args) {
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		
		int count = 0;
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count++;
				sum += arr[i][j];
				avg = sum / count;
			}
		}
		System.out.printf("student: %d ", count);
		System.out.printf("sum: %.0f, avg: %.1f", sum, avg);
	}

}
