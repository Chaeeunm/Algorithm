package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11724_2 {

	static int[][] graph;
	static boolean[] visited;
	static int n;

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;

		graph = new int[n+1][n+1];
		visited = new boolean[n+1];

		while (m-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = graph[b][a] = 1;
		}

		for(int i =1; i<n; i++) {
			if(!visited[i]){
				dfs(i);
				cnt++;
			}
		}

		System.out.println(cnt);


	}

	public static void dfs(int start){
		if(visited[start]) {
			return;
		}
		visited[start] = true;
		for(int i =1; i<n; i++) {
			if(graph[start][i] ==1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
