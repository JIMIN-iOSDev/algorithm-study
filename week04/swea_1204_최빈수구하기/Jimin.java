import java.util.Scanner;

public class swea_1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			int [] arr = new int[101]; //0점 ~ 100점 담을 배열
			int student = 1000;
			int max = 0;
			int index = 0;
			
			while(student >= 1) {
				arr[sc.nextInt()]++; //배열의 해당 점수 칸에 담기
				student--;
			}
			
			//작은 값부터 돌리기 때문에 최빈수가 여러 개일 때 마지막으로 큰 값이 담김
			for (int i = 0; i < 101; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					index = i;
				}
			}
			
			System.out.printf("#%d %d%n", tc, index);
		}
	}
}
