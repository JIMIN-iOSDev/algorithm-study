package pgs;

import java.util.*;

public class Soonil {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int N = sc.nextInt();
            int K = sc.nextInt();
            String str = sc.next();

            String[] sList = str.split("");
            Queue<String> q = new ArrayDeque<>();
            for (int i = 0; i < sList.length; i++) {
                q.add(sList[i]);
            }
            Set<String> set = new HashSet<>();

            for (int i = 0; i < sList.length / 4; i++) {
                StringBuilder sb = new StringBuilder();
                sList = q.toArray(new String[0]);
                for (int l = 0; l < sList.length; l++) {
                    sb.append(sList[l]);
                }

                for (int j = 0; j < 4; j++) {
                    set.add(sb.substring(j * (sList.length / 4), (j + 1) * (sList.length / 4)));
                }
                q.add(q.poll());
            }
            int[] ansList = set.stream().mapToInt(s -> Integer.parseInt(s, 16)).toArray();
            Arrays.sort(ansList);
            System.out.println("#" + test_case + " " + ansList[ansList.length - K]);
        }
    }

}
