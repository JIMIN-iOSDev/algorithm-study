package test;

import java.util.Scanner;
import java.util.Stack;

public class 택배상자꺼내기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int num = sc.nextInt();
			int cnt = 1;
			int ans_stack = 0;
			int ans = 0;
			int popped = 0;

			Stack<Integer>[] stacks = new Stack[w];

			for (int i = 0; i < w; i++) {
				stacks[i] = new Stack<>();
			}

			while (cnt <= n) {
				for (int i = 0; i < w && cnt <= n; i++) {
					if (cnt == num) {
						ans_stack = i;
					}
					stacks[i].push(cnt);
					cnt++;
				}

				for (int i = w - 1; i >= 0 && cnt <= n; i--) {
					if (cnt == num) {
						ans_stack = i;
					}
					stacks[i].push(cnt);
					cnt++;
				}
			}

			for (int i = 0; i < n / w + 1; i++) {
				popped = stacks[ans_stack].pop();
				ans++;

				if (popped == num) {
					break;
				}

			}
			

			System.out.println(ans);

		}

	}

}
