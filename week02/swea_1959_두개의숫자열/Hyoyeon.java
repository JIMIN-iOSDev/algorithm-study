import java.util.Scanner;

public class Hyoyeon {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int j = 1; j <= T; j++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int[] s = new int[A];
			int[] l = new int[B];

			for (int a = 0; a < s.length; a++) {
				s[a] = sc.nextInt();
			}
			for (int b = 0; b < l.length; b++) {
				l[b] = sc.nextInt();
			}
			int[] arra;
			int[] arrb;

			if (A < B) {
				arra = s;
				arrb = l;
			} else {
				arra = l;
				arrb = s;
			}

			int max = -2147483648;

			for (int i = 0; i < arrb.length - arra.length + 1; i++) {
				int sum = 0;
				for (int h = 0; h < arra.length; h++) {
					sum += arra[h] * arrb[h + i];
				}
				if (max <= sum) {
					max = sum;
				}
			}
			System.out.println("#" + j + " " + max);
		}
	}
}