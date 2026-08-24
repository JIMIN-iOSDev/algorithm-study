import java.io.FileInputStream;
import java.util.Scanner;

class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T;
    T = sc.nextInt();

    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      int count = 0;
      int max = 0;
      long sum = 0;
      int[] p_arr = new int[N];

      for (int j = 0; j < N; j++) {
        int price = sc.nextInt();
        p_arr[j] = price;
      }

      for (int j = N - 1; j >= 1; j--) {
        if (p_arr[j] > max) {
          max = p_arr[j];
        }
        if (max > p_arr[j - 1]) {
          sum += max - p_arr[j - 1];
        } else {
          max = p_arr[j - 1];
          sum += 0;
        }

      }
      System.out.printf("#%d %d%n", test_case, sum);
    }
  }
}