import java.util.Scanner;

public class swea_1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int result = 0;
			
			//주변 4칸 높이 비교
			for (int i = 2; i < N - 2; i++) {
				int max = Integer.MIN_VALUE;
				if (arr[i - 2] < arr[i] && arr[i - 1] < arr[i] && arr[i + 1] < arr[i] && arr[i + 2] < arr[i]) {
					max = Math.max(max, arr[i - 2]);
					max = Math.max(max, arr[i - 1]);
					max = Math.max(max, arr[i + 1]);
					max = Math.max(max, arr[i + 2]);
					result += arr[i] - max;
				}
			}
			System.out.printf("#%d %d%n", tc, result);
		}
		sc.close();
	}
}
