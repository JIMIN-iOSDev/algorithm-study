import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class swea_5658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int i = 1; i <= tc; i++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			Deque<Character> queue = new ArrayDeque<>();
			Set<String> set = new HashSet<>();
			String s = sc.next();

			for (int j = 0; j < N; j++) {
				char c = s.charAt(j);
				queue.add(c);
			}

			// for문 반복
			StringBuilder sb = new StringBuilder();
			for (int a = 0; a < N; a++) {
				sb.setLength(0);
				// 이중 for문
				for (int b = 0; b < N/4; b++) {
					// 3개씩 빼서 set에 넣어주기
					sb.append(queue.poll());

				}
				set.add(sb.toString());

				//  앞에 역순으로 넣어서 원래 상태 복구
			    for (int d = sb.length() - 1; d >= 0; d--) {
			        queue.addFirst(sb.charAt(d));
			    }

			    // 맨앞 한 글자를 뒤로 보내서 회전
			    queue.addLast(queue.pollFirst());
			}

			// set 내림차순
			List<String> list = new ArrayList<>(set);
			list.sort(Collections.reverseOrder());
			
			
			String answer = list.get(K - 1);
			int value = Integer.parseInt(answer, 16);
			
			System.out.println("#" + i + " " + value);
		}
	}
}
