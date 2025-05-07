package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_1303 {

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] graph;
	static boolean[][] visitedW;
	static boolean[][] visitedB;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int garo = Integer.parseInt(st.nextToken());
		int sero = Integer.parseInt(st.nextToken());;

		graph = new int[sero+1][garo+1];
		visitedW = new boolean[sero+1][garo+1];
		visitedB = new boolean[sero+1][garo+1];

		long wPower = 0;
		long bPower = 0;

		for(int a = 1; a <= sero; a++) {
			String str = br.readLine();
			for(int b = 1; b <= garo; b++ ) {
				if(str.charAt(b-1) == 'B') {
					graph[a][b] = 1;
				}
			}
		}

		for(int y =1; y<= sero; y++) {
			for(int x =1; x<= garo; x++) {
				if(!visitedW[y][x] && graph[y][x] ==0) {
					int wSize = bfs(x,y,false);
					wPower += wSize*wSize;
				}

				if(!visitedB[y][x] && graph[y][x] ==1) {
					int bSize = bfs(x,y,true);
					bPower += bSize*bSize;
				}
			}
		}

		System.out.println(wPower + " " + bPower);

	}

	public static int bfs(int x, int y, boolean isBlack){
		Queue<Integer[]> queue = new LinkedList<>();
		int size = 1;
		queue.offer(new Integer[]{x,y});
		if(isBlack) {
			visitedB[y][x] = true;
		} else {
			visitedW[y][x] = true;
		}

		while (!queue.isEmpty()) {
			Integer[] now = queue.poll();
			int nowX = now[0];
			int nowY = now[1];

			for(int i =0; i<4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];

				if(nextX<1||nextX>graph[0].length -1||
				nextY<1|| nextY> graph.length -1) {continue;}
				if(isBlack){
					if(graph[nextY][nextX] ==1 && !visitedB[nextY][nextX]){
						visitedB[nextY][nextX] = true;
						queue.offer(new Integer[]{nextX,nextY});
						size++;
					}
				}//흰색일때
				else {
					if(graph[nextY][nextX] ==0 && !visitedW[nextY][nextX]){
						visitedW[nextY][nextX] = true;
						queue.offer(new Integer[]{nextX,nextY});
						size++;
					}
				}
			}
		}

		return size;
	}
}
