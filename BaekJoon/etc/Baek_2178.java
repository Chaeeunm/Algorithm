package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_2178 {

	public static int[] dx = new int[]{-1,1,0,0};
	public static int[] dy = new int[]{0,0,-1,1};
	public static int x;
	public static int y;

	public static int[][] graph;
	public static int[][] dp;
	public static boolean[][] visited;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		graph = new int[y][x];
		visited = new boolean[y][x];

		y--; x--;
		for(int i =0; i<= y; i++) {
			String str = br.readLine();
			for(int j =0; j<= x; j++) {
				int num = (str.charAt(j) == '1')?1:0;
				graph[i][j] = num;
			}
		}

		System.out.println(bfs());

	}

	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[]{0,0,1});
		visited[0][0] = true;

		while (!queue.isEmpty()) {
			int[] now = queue.poll();

			int nowX = now[0];
			int nowY = now[1];
			int depth = now[2];
			if(nowX == x && nowY == y) {
				return depth;
			}

			for(int i =0; i<4; i++) {
				int plusX = nowX + dx[i];
				int plusY = nowY + dy[i];

				//x= 5 y = 3
				if(plusX<0||plusX>x||plusY<0||plusY>y){
					continue;
				} if(graph[plusY][plusX] == 1 && !visited[plusY][plusX]) {
					queue.offer(new int[]{plusX,plusY,depth+1});
					visited[plusY][plusX] = true;
				}

			}
		}
		return 0;
	}
}
