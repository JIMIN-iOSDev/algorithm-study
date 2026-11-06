class Solution {
    public int solution(int[][] info, int n, int m) {
        
        int a = 0;
        int b = 0;
        int depth = 0;
        int answer = dfs(info, n, m, a, b, depth);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
    public int dfs(int[][] info, int n, int m, int a, int b, int depth){
        if (a >= n || b >= m) {
            return Integer.MAX_VALUE;
        }
        if (depth == info.length) {
            return a;
        }
        int takeB = dfs(info, n, m,
                       a, b + info[depth][1], depth + 1);

        int takeA = dfs(info, n, m,
                       a + info[depth][0], b, depth + 1);

        return Math.min(takeA, takeB);
        
    }
}
