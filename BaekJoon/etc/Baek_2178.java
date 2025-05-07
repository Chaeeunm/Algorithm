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


		//한바퀴 돌때마다 카운트 증가,
		//x,y 왔을때 총 몇바퀴 도는지 확인

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		y = Integer.parseInt(st.nextToken()) -1;
		x = Integer.parseInt(st.nextToken()) -1;
		graph = new int[y][x];
		visited = new boolean[y][x];

		for(int i =0; i<= y; i++) {
			String str = br.readLine();
			for(int j =0; i<= x; j++) {
				graph[i][j] = str.charAt(j);
			}
		}

		System.out.println(bfs());

	}

	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		int result = 0;

		queue.offer(new int[]{0,0});

		while (!queue.isEmpty()) {
			int[] now = queue.poll();

			int nowX = now[0];
			int nowY = now[1];
			if(nowX == x && nowY == y) {
				break;
			}
			for(int i =0; i<4; i++) {
				int plusX = nowX + dx[i];
				int plusY = nowY + dy[i];

				if(nowX<1||nowX+plusX>=x||nowY<1||nowY+plusY>=y){
					continue;
				} if(graph[nowY][nowX] == 1 && !visited[nowY][nowX]) {
					queue.offer(new int[]{nowX,nowY});
					result ++;
				}

			}
		}

		return result;

	}
}
