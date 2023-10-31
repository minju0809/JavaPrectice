package ch03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberEx {
	public static void main(String[] args) {
//		int n = 5;
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = (int) (Math.random() * 10) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		int b = 0;
//		
//		Arrays.sort(arr);
//		for (int number : arr) {
//			System.out.print(number + " ");
//			arr[b] = number;
//			b++;
//		}
//		System.out.println();
//		for (int z = (n-1); z >= 0; z--) {
//			System.out.print(arr[z] + " ");
//		}

		Random random = new Random();
		Set<Integer> set = new HashSet<>();

		while (set.size() < 5) {
			int ran = random.nextInt(10) + 1;
			set.add(ran);
		}

		int[] k = new int[5];
		int i = 0;
		for (int s : set) {
			System.out.print(s + " ");
			k[i] = s;
			i++;
		}
		System.out.println();
		for (int j = 4; j >= 0; j--) {
			System.out.print(k[j] + " ");
		}
	}
}