import java.util.Scanner;

public class swea_1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			
			//최대, 최소 구하기
			int min = arr[0];
			int max = arr[0];
			int idxmin = 0;
			int idxmax = 0;
			
			for (int i = 0; i < 10; i++) {
				if (min > arr[i]) {
					min = arr[i];
					idxmin = i;
				} else if (max < arr[i]) {
					max = arr[i];
					idxmax = i;
				}
			}
			
			//최대, 최소 제외하고 평균
			int sum = 0;
			int count = 0;
			
			for (int i = 0; i < 10; i++) {
				if (i != idxmin && i != idxmax) {
					sum += arr[i];
					count++;
				}
			}
			
			System.out.printf("#%d %d%n", tc, Math.round((double)sum/count));
		}
	}
}
