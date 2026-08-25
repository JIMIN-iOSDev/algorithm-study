

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 1; i <= 10; i++) {
			int cnt = sc.nextInt();
			for (int j = 0; j < 100; j++) {
				arr[j] = sc.nextInt();
			}
			
			for (int k = 0; k < cnt; k++) {
				int max = 0;
				int min = 0;

				for (int h = 0; h < 100; h++) {
					if (arr[h] <= arr[min]) {
						min = h;
					}
					if (arr[h] >= arr[max]) {
						max = h;
					}
				}
				arr[max]--;
				arr[min]++;
			}
			
			System.out.println("#" + i + " " + (Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt()));

		}
	}
}
