import java.util.Scanner;

public class swea_21425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			int count = 0;

			while (A <= N && B <= N) {
				// 작은 숫자에 큰 숫자를 더하는게 속도가 더 빠를 거 같음
				while (A >= B) {
					B += A;
					count++;
				}

				while (A < B && (A <= N && B <= N)) {
					A += B;
					count++;
				}
			}

			System.out.println(count);
		}
		sc.close();
		
	}

}
