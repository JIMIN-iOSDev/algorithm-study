

import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {
		// 슬라이딩 윈도우 5개로 잡아서
		// 가운데를 기준으로 양쪽 2개씩이 자신보다 작으면
		// 나 - 가장 큰거를 sum에 담기
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int sum = 0;
			int cnt = sc.nextInt();
			int[] arr = new int[cnt];
			for (int j = 0; j < arr.length; j++) {
				arr[j]=sc.nextInt();
			}
			
			for (int h = 2; h < arr.length-2; h++) {
				int max = Math.max(Math.max(arr[h-1], arr[h-2]), Math.max(arr[h+1], arr[h+2]));
				if(max<arr[h]) {
					sum+=arr[h]-max;
				}
				
			}
			
			
			System.out.println("#" + i + " " + sum);
		}

	}
}
