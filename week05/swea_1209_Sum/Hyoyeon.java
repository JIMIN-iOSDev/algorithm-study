

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			int T = sc.nextInt();
			int[][] arr = new int[100][100];
			int [] chk = new int[202];
			int max = 0;
			
			for (int j = 0; j < 100; j++) {
				for (int h = 0; h < 100; h++) {
					arr[j][h] = sc.nextInt();
				}
			}
			for (int j = 0; j < 100; j++) {
				for (int h = 0; h < 100; h++) {
					chk[j]+=arr[j][h]; 
					chk[j+100]+=arr[h][j];
				}
			}
			int a =99;
			for (int j = 0; j < 100; j++) {
				chk[200]+=arr[j][j];
				chk[201]+=arr[a][j];
				a--;
			}

			
			for(int j=0;j<chk.length;j++) {
				if(max<=chk[j]) {
					max = chk[j];
				}
			}
			
			System.out.println("#"+T+" "+max);
		}
	}
}
