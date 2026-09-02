package algo_study;

import java.util.Scanner;

public class swea_1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int cnt = 0;
			int result =0;
			int test = sc.nextInt();
			String temp_chk = sc.next();
			char[] chk = new char[temp_chk.length()];
			for (int h = 0; h < temp_chk.length(); h++) {
				chk[h] = temp_chk.charAt(h);
			}

			String temp_word = sc.next();
			char[] word = new char[temp_word.length()];
			for (int j = 0; j < temp_word.length(); j++) {
				word[j] = temp_word.charAt(j);
			}

			for (int a = 0; a <= word.length-chk.length; a++) {
				cnt=0;
				for (int b = 0; b < chk.length; b++) {
					if(word[a+b]==chk[b]) {
						cnt++;
						if(cnt==chk.length) {
							result++;
							cnt=0;
						}
					}else {
						cnt=0;
					}
				}
			}
			System.out.println("#" + test + " " + result);
		}
	}
}
