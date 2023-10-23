package ch02;

public class MultidimensionArrayByNew {

	public static void main(String[] args) {
		String[][] names = new String[3][3];
		names[1][1] = "둘리";
		names[1][2] = "하니";

		for (int x = 0; x < names.length; x++) {
			for (int y = 0; y < names[x].length; y++) {
				System.out.printf("%3s ", names[x][y]);
//				if (x == 1) {
//					System.out.printf("%3s ", names[x][y]);
//				}
			}
			System.out.println();
		}
	}

}
