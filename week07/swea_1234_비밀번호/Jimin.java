package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1234 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("data/input.txt"));
		
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			String str = sc.next();
			StringBuilder sb = new StringBuilder(str);
			
			int i = 0;
			
			while (i < sb.length() - 1) {
				if (sb.charAt(i) == sb.charAt(i + 1)) {
					sb.deleteCharAt(i);
					sb.deleteCharAt(i); //i를 삭제하면 당겨지기 때문에 i를 또 삭제해야함
					
					if (i > 0) i--;
				} else i++;
			}
			
			System.out.printf("#%d %s%n", tc, sb);
		}
	}
}
