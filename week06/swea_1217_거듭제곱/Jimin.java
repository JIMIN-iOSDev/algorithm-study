package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea_1217 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));
		
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.printf("#%d %d%n", tc, power(N, M));
		}
	}
	
	static int power(int n, int m) {
		if (m == 0) return 1;
		return n * power(n, m - 1);
	}
}
