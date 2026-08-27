

import java.util.Arrays;
import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int c = 1; c <= T; c++) {
			int cnt = sc.nextInt();
			int w = sc.nextInt();

			int[] arr = new int[cnt];
			int chk = 0;
			int v = -1;
			for (int j = 0; j < cnt; j++) {
				arr[j] = sc.nextInt();
			}

			Arrays.sort(arr);

			int i = 0;
			int j = cnt - 1;
			while (i < j) {
				if (arr[i] + arr[j] == w) {
					v = w;
					break;
				}
				if (arr[i] + arr[j] < w) {

					if (v < arr[i] + arr[j]) {
						v = arr[i] + arr[j];
					}
					i++;

				}
				if (arr[i] + arr[j] > w) {
					j--;
				}

			}
			System.out.println("#" + c + " " + v);
		}
	}
}
