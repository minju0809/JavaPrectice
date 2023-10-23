package ch02;

public class MultidimensionalArrayByValueList {

	public static void main(String[] args) {
		int[][] intArr = { { 69, 78, 90 }, { 78, 80 } };
		intArr[1][1] = 100;
//		System.out.println("총 학생 수: " + intArr.length);
//		System.out.println("1반 학생 수: " + intArr[0].length);
//		System.out.println("2반 학생 수 " + intArr[1].length);
//		System.out.println();

		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(i+1 + "반: ");
			for (int j = 0; j < intArr[i].length; j++) {
//				System.out.print(intArr[i][j] + " ");
			}
//			System.out.println();
		}

		int[][] intArr2 = new int[2][3];
		intArr2[0][1] = 20;

		System.out.println(intArr2.length);
		System.out.println(intArr2[0].length);
		System.out.println(intArr2[1].length);
		System.out.println(intArr2[0][1]);

		for (int i = 0; i < intArr2.length; i++) {
			for (int j = 0; j < intArr2[i].length; j++) {
				System.out.print(intArr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
