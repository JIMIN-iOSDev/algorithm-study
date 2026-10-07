package test;

import java.util.*;

public class 보물상자비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String s = sc.next();
			int oneside = N / 4;

			List<String> list = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				String s_split = s.substring(i, i + 1);
				list.add(i, s_split);
			}

			Set<Integer> set = new HashSet<>();

			for (int i = 0; i < oneside; i++) {

				for (int j = 0; j < N; j += oneside) {
					String tmp = "";
					for (int k = j; k < j + oneside; k++) {
						tmp += list.get(k);
					}

					int num = Integer.parseInt(tmp, 16);
					set.add(num);
				}

				list.add(0, list.get(N - 1));
				list.remove(N);
			}

			List<Integer> f_list = new ArrayList<>(set);
			f_list.sort(Collections.reverseOrder());

			System.out.printf("#%d %d%n", tc, f_list.get(K - 1));

		}
	}

}
