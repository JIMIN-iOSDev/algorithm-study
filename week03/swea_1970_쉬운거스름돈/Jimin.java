import java.util.Scanner;

public class swea_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] result = new int[arr.length];
			int i = 0;
			
			for (int num: arr) {
				int count = 0;
				while (N >= num) {
					count++;
					N = N - num;
				}
				result[i] = count;
				i++;
			}
			
			System.out.printf("#%d%n", tc);
			for (int num: result) {
				System.out.print(num + " ");
			}
		}
	}
}
