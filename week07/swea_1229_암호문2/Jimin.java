package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1229 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt(); //원본 길이 
			List<Integer> original = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				original.add(sc.nextInt());
			}
			
			int count = sc.nextInt(); //명령어 개수
			
			for (int i = 1; i <= count; i++) {
				String type = sc.next(); //명령어 종류
				
				if (type.equals("I")) { //명령어 "I"
					int x = sc.nextInt();
					int y = sc.nextInt();
					int[] nums = new int[y];
					
					for (int j = 0; j < y; j++) {
						nums[j] = sc.nextInt();
					}
					
					//x 위치에 y개의 숫자 삽입
					for (int j = 0; j < y; j++) {
						original.add(x + j, nums[j]);
					}
					
				} else { //명령어 "D"
					int x = sc.nextInt();
					int y = sc.nextInt();
					
					//x 위치부터 y개의 숫자 삭제
					for (int j = 0; j < y; j++) {
						original.remove(x);
					}
				}
			}
			
			//orginal 처음 10개 출력
			System.out.printf("#%d ", tc);
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d ", original.get(i));
			}
			System.out.println();
		}
	}
}
