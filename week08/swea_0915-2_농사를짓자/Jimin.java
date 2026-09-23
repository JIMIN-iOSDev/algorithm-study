package a;

import java.util.Arrays;
import java.util.Scanner;

public class 농사 {
	static int N, M, ans;
	static int[][] map;
	static int[][] growCount; //몇번째로 심은 씨인지
	static int[][] delta = {
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0}
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N][N];
			ans = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//map 초기화를 위한 복사
			int[][] tmpmap = new int[N][];
			
			for (int i = 0; i < N; i++) {
				tmpmap[i] = Arrays.copyOf(map[i], map[i].length);
			}
			
			//map에서 시작위치
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (map[i][j] == 1) continue;
					
					for (int k = 0; k < 4; k++) {
						growCount = new int[N][N]; //시작점, 방향 달라질때마다 재배 횟수 초기화
						
						move(i, j, 2, k, 0);
						
						//map 원상복구
						for (int l = 0; l < N; l++) {
							map[l] = Arrays.copyOf(tmpmap[l], tmpmap[l].length);
						}
					}
				}
			}
			
			System.out.printf("#%d %d%n", tc, ans);
		}
	}
	
	//오전 오후 실제 작업
	static void move(int r, int c, int depth, int direction, int harvest) {
		if (depth == M + 2) {
			ans = Math.max(ans, harvest);
			return;
		}
		
		//오전
		if (map[r][c] == 0 && canMove(r, c, depth)) {
			growCount[r][c]++;
			map[r][c] = depth;
		} else if (isHarvestable(r, c, depth)) {
			map[r][c] = 0;
			harvest++; //수확함
		}
		
		//오후
		int dir = findDirection(r, c, direction, depth);
		
		//이동 불가능 -> 제자리
		if (dir == 4) move(r, c, depth + 1, direction, harvest);
		
		//이동
		else {
			int nr = r + delta[dir][0];
			int nc = c + delta[dir][1];
			
			move(nr, nc, depth + 1, dir, harvest);
		}
	}
	
	//곡식인가
	static boolean isHarvestable(int r, int c, int depth) {
		return map[r][c] > 1 && map[r][c] + 3 + growCount[r][c] < depth;
	}
	
	//주변 이동 가능한가
	static boolean canMove(int r, int c, int depth) {
		for (int i = 0; i < 4; i++) {
			int nr = r + delta[i][0];
			int nc = c + delta[i][1];
			
			if (map[nr][nc] == 0 || isHarvestable(nr, nc, depth)) return true;
		}
		
		return false;
	}
	
	//우 -> 앞 -> 좌 -> 뒤
	static int findDirection(int r, int c, int dir, int depth) {
		int[] order = {
				(dir + 1) % 4,
				dir,
				(dir + 3) % 4,
				(dir + 2) % 4
		};
		
		for (int nd: order) {
			int nr = r + delta[nd][0];
			int nc = c + delta[nd][1];
			
			if (map[nr][nc] == 0 || isHarvestable(nr, nc, depth)) return nd;
		}
		
		return 4;
	}
	
}
