package d2;

import java.util.Scanner;

public class swea_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int start = 0; //속도 
			int range = 0; //거리 
			
			for (int i = 1; i <= N; i++) {
				int command = sc.nextInt();
				
				if (command == 0) {
					range += start;
				} else if (command == 1) {
					int speed = sc.nextInt();
					start += speed;
					range += start;
				} else {
					int speed = sc.nextInt();
					if (start - speed > 0) {
						start -= speed;
					} else {
						start = 0;
					}
					range += start;
				}
			}
			System.out.printf("#%d %d%n", test_case, range);
		}
	}
}
