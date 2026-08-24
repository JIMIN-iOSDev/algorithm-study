package d2;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			 
			Arrays.sort(arr);
			
			System.out.print("#" + test_case + " ");
			
			for (int i : arr) {
				System.out.print(i + " ");				
			}
			
			System.out.println();
		}
	}
}
