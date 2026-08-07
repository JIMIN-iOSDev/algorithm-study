package d2;

import java.util.Scanner;

public class swea_1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//N만큼 돌기 
		for (int i = 1; i <= N; i++) {
			int count = 0;
			int memory = i;

			while (memory != 0) {
				//3, 6, 9를 포함하고 있는 경우 
				if (memory % 10 == 3 || memory % 10 == 6 || memory % 10 == 9) {
					count++;
				} 
				memory /= 10;				
			}
			
			//count가 0이면 3, 6, 9 중 하나도 포함 x
			if (count == 0) {
				System.out.print(i + " ");
			} else {
				for (int j = 0; j < count; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}
}
