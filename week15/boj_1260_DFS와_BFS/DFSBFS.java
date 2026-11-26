import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSBFS {
	static boolean[] dfsVisited;
	static boolean[] bfsVisited;
	static int[][] graph;
	static int N;
	static int M;
	static int V;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		graph = new int[N+1][N+1];
		dfsVisited = new boolean[N+1];
		bfsVisited = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs(V);
		System.out.println();
		bfs(V);
	}
	
	static void dfs(int node) {	
		dfsVisited[node] = true;
		System.out.print(node + " ");
		
		for(int i=1; i<=N; i++) {
			if(graph[node][i]==1 && dfsVisited[i]==false) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		
		// 1. 큐에 시작 정점 넣기
		queue.offer(node);
		
		// 2. bfsVisited 방문 처리
		bfsVisited[node] = true;
		
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			System.out.print(tmp + " ");
			
			for(int i=1; i<=N; i++) {
				if(graph[tmp][i]==1 && bfsVisited[i]==false) {
					queue.offer(i);
					bfsVisited[i] = true;
				}
			}
		}
	}
}
