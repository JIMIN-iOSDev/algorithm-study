package SWEA;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class swea_1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int cnt = sc.nextInt();
			int[] arr = new int[1000];
			int[] chk = new int[101];
			for (int h = 0; h < 1000; h++) {
				arr[h] = sc.nextInt();
			}
//			for (int h = 0; h < 1000; h++) {
//			    chk[sc.nextInt()]++;
//			}
			for (int j = 0; j < 1000; j++) {
				chk[arr[j]] += 1;
			}
			int max = 0;
			int result = 0;
			for (int j = 0; j <= 100; j++) {
				if (max <= chk[j]) {
					max = chk[j];
					result = j;
				}
			}
			System.out.println("#" + i + " " + result);
		}
	}
}
