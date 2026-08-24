package SWEA;

import java.util.Scanner;

public class swea_21425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int N=sc.nextInt();
			
			int x=A>B ? A:B;
			int y=A>B ? B:A;
			int cnt =0;

			while(x<=N && y<=N) {
				if(x>y) {
					y+=x;
					cnt++;
				}else {
					x+=y;
					cnt++;
				}
				
				
			}
			System.out.println(cnt);
		}
	}
}
