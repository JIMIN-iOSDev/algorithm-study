package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1221 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));
		
		int T = sc.nextInt();
		String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		for (int tc = 1; tc <= T; tc++) {
			sc.next();
			int N = sc.nextInt();
			String[] input = new String[N];
			System.out.printf("#%d%n", tc);
			
			for (int i = 0; i < N; i++) {
				input[i] = sc.next();
			}

			for (int i = 0; i < 10; i++) {
				int count = 0;
				for (int j = 0; j < N; j++) {
					if (input[j].equals(arr[i])) {
						count++;
					}
				}
				for (int k = 0; k < count; k++) {
					System.out.printf("%s ", arr[i]);
				}
				System.out.println();
			}
		}
	}
}
