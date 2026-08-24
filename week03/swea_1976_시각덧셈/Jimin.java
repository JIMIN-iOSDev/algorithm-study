import java.util.Scanner;

public class swea_1976 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int hour1 = sc.nextInt();
			int min1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int min2 = sc.nextInt();
			int hour = hour1 + hour2;
			int min = min1 + min2;
			
			if (min >= 60) {
				//59, 59분 입력받아도 최대값은 118
				hour += 1;
				min -= 60;
			}
			
			if (hour >= 13) {
				hour -= 12;
			}
			
			System.out.printf("#%d %d %d%n", tc, hour, min);
		}
	}
}
