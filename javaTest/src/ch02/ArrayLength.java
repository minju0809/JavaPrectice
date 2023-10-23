package ch02;

public class ArrayLength {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[4] = 30;
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + intArr.length);
		
		int[] intArr2 = new int[] {0,2,3,4,0};
		intArr2[1] = 20;
		intArr2[4] = 30;
		for (int j : intArr2) {
			System.out.print(j + " ");
		}
		System.out.println("\n" + intArr2.length);
	}

}
