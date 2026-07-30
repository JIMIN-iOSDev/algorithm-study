

import java.util.Scanner;
import java.io.FileInputStream;

public class Hyoyeon {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		for (int test_case = 0; test_case < T; test_case++) {
			int sum=0;
			int num=1;
			int cnt=1;
			
		
			for(int i=0;i<arr[test_case];i++) {
				if(cnt%2==1) {
					sum+=num;
					//System.out.println(num);
				}else{
					sum-=num;
					//System.out.println(num);
				}
				if(cnt==arr[test_case]) {
					break;
				}
				cnt++;
				num++;
			}
			System.out.printf("#%d %d\n",test_case+1 , sum);
		}
	}
}