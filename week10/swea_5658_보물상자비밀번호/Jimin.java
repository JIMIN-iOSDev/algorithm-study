package a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Swea_5658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String str = sc.next();
			
			int size = N / 4; //한 변에 적히는 문자 수 
			Set<Integer> set = new TreeSet<>(Comparator.reverseOrder()); //중복되지 않는 숫자 내림차순으로 담기 
			
			for (int i = 1; i <= size; i++) {
				str = str.charAt(N - 1) + str.substring(0, N - 1); //맨 끝 문자를 맨 앞에 붙이기 
				
				//자른 문자열 set에 담기
				for (int start = 0; start < N; start += size) {
					set.add(Integer.parseInt(str.substring(start, start + size), 16)); //16진수 -> 10진수 
				}
			}
			
			//Set을 List로 바꿔서 인덱스 사용
			List<Integer> list = new ArrayList<>(set);
			System.out.printf("#%d %d%n", tc, list.get(K - 1));
		}
	}
}