package ch02;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = {1,4,3,8,9 };
		int max = arr[0];
		
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
