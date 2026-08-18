import java.util.Scanner;

public class swea_9229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner("""
1
4 100
80 80 60 60
				""");
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int start = 0;
			int end = N - 1;
			
			while(start < end && arr[start] + arr[end] != M) {
				if (arr[start] + arr[end] > M) {
					end--;
				} else if (arr[start] + arr[end] < M) {
					start++;
				}
			}
			
			if(arr[start] + arr[end] > M) {
				System.out.printf("#%d %d%n", tc, -1);
			} else {
				System.out.printf("#%d %d%n", tc, arr[start] + arr[end]);
			}
		}
	}
}
