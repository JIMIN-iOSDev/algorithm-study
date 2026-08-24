package SWEA;

import java.util.Scanner;

public class swea_1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[10];
		for (int i = 1; i <= T; i++) {
			int max = 0;
			int min = 10000;
			int sum = 0;
			for (int j = 0; j < 10; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < 10; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
				if (min > arr[j]) {
					min = arr[j];
				}
			}
			for (int j = 0; j < 10; j++) {
				if(arr[j]==min || max==arr[j]) {
					continue;
				}
				sum += arr[j];
			}
			System.out.println("#" + i + " " + (Math.round((double)sum / 8)));

		}
	}
}
