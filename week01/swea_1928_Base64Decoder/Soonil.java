import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		String[] code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".split("");
		int[] sixs = {32, 16, 8, 4, 2, 1};
		int[] eights = {128, 64, 32, 16, 8, 4, 2, 1};
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.printf("#%d ", test_case);
			String[] input = sc.next().split("");
			String ans = "";
			String result = "";
			
			for(int i = 0; i < input.length; i++) {
				int[] six = new int[6];
				for(int j = 0; j < code.length; j++) {
					if (input[i].equals(code[j])) {
						for ( int k = 0; k < sixs.length; k++) {
							if (j >= sixs[k]) {
								six[k] = 1;
								j -= sixs[k];
							}
						}
						
						for (int s : six) {
							ans += s;
						}
						break;
					}
				}
				
			}
			
			for(int i = 0; i < ans.length() - 8; i += 8) {
				int temp = 0;
				for(int j = 0; j < 8; j++) {
					if (ans.charAt(i + j) == '1') {
						temp += eights[j];
					}
				}
				System.out.print((char)temp);
			}
			
			System.out.println(".");
		}

	}
}