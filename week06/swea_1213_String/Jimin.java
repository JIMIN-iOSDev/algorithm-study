package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea_1213 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));

		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			String str = sc.next();
			char[] arr = sc.next().toCharArray();
			int N = str.length();
			int M = arr.length;
			int result = 0;

			for (int j = 0; j <= M - N; j++) {
				int count = 0;
				if (arr[j] == str.charAt(0)) {
					for (int i = 0; i < N; i++) {
						if (arr[j + i] == str.charAt(i)) count++;
						else break;
					}
					if (count == N) result++;
				}
			}
			System.out.printf("#%d %d%n", tc, result);
		}
	}
}
