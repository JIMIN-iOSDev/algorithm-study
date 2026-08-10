import java.util.Scanner;

public class swea_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int memory = N;
			String[] str = new String[N];
			int[] repeat = new int[N];
			StringBuilder sb = new StringBuilder();
			
			//값 받아오기
			while(N >= 1) {
				str[memory - N] = sc.next();
				repeat[memory - N] = sc.nextInt();
				N--;
			}
			
			//sb에 한 번에 모으기
			for(int i = 0; i < memory; i++) {
				for (int j = 1; j <= repeat[i]; j++) {
					sb.append(str[i]);
				}
			}

			//sb 값 10개씩 자르기
			int num = 0;
			
			System.out.printf("#%d%n", tc);
			
			while(num + 10 <= sb.length()) {
				System.out.println(sb.substring(num, num + 10));
				num += 10;
			}
			
			System.out.println(sb.substring(num)); //마지막 줄
		}
	}
}
