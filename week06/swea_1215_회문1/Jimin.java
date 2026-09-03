package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea_1215 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			char[][] arr = new char[8][8];
			int result = 0;

			for (int i = 0; i < 8; i++) {
				arr[i] = sc.next().toCharArray();
			}

			//행 검사 
			for (int i = 0; i < 8; i++) { 
				for (int j = 0; j <= 8 - N; j++) { //회문 시작 가능 위치 
					int front = j;
					int rear = j + N - 1;
					boolean chk = true;

					while (front < rear) {
						if (arr[i][front] == arr[i][rear]) {
							front++;
							rear--;
						} else {
							chk = false;
							break;
						}
					}
					if (chk) result++;
				}
			}

			//열 검사 
			for (int i = 0; i < 8; i++) { 
				for (int j = 0; j <= 8 -N; j++) {
					int front = j;
					int rear = j + N - 1;
					boolean chk = true;

					while (front < rear) {
						if (arr[front][i] == arr[rear][i]) {
							front++;
							rear--;
						} else {
							chk = false;
							break;
						}
					}
					if (chk) result++;
				}
			}

			System.out.printf("#%d %d%n", tc, result);
		}
	}
}
