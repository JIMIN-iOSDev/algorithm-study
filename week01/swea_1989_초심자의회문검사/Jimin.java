import java.util.Scanner;

public class Jimin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result = 0;
		
		for (int i = 1; i <= T; i ++) {
			String str = sc.next();
			
			for (int j = 0; j < str.length() / 2; j++) {
				if (str.charAt(j) == str.charAt(str.length()-1-j)) {
					result = 1;
				} else {
					result = 0;
					break;
				}
			}
			
			System.out.println("#" + i + " " + result);
		}

	}

}
