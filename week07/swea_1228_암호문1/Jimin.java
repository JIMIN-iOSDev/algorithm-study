package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1228 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt(); // 원본 길이
			List<Integer> original = new ArrayList<>(); // 원본

			for (int i = 0; i < N; i++) {
				original.add(sc.nextInt());
			}

			int M = sc.nextInt(); // 명령어 개수

			for (int i = 1; i <= M; i++) {
				sc.next(); // I
				int x = sc.nextInt(); // 삽입 위치
				int y = sc.nextInt(); // 삽입 개수

				int[] command = new int[y]; // 삽입할 숫자

				for (int j = 0; j < y; j++) {
					command[j] = sc.nextInt();
				}

				// 원본에 삽입
				for (int l = 0; l < y; l++) {
					original.add(x + l, command[l]);
				}
			}

			System.out.printf("#%d ", tc);
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d ", original.get(i));
			}
			System.out.println();
		}
	}
}
