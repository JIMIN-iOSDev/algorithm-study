

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Hyoyeon {

//class Solution
//{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int[] arr = new int[A];
			for (int i = 0; i < A; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.print("#" + test_case + " ");
			for (int j = 0; j < A; j++) {

				System.out.print(arr[j] + " ");
			}
			System.out.println();

		}

	}
}
