package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_1743_BFS {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
	static int[] dy = {-1, 0, 1, 0}; // 동, 남, 서, 북
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sero = Integer.parseInt(st.nextToken());
		int garo = Integer.parseInt(st.nextToken());
		int foodCnt = Integer.parseInt(st.nextToken()); // 음식물 수

		map = new int[sero + 1][garo + 1];
		visited = new boolean[sero + 1][garo + 1];

		while (foodCnt-- > 0) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			map[y][x] = 1;
		}


		int maxSize = 0;

		for(int y=1 ; y<= sero;  y++){
			for(int x=1; x <= garo; x++) {
				if(map[y][x] ==1) {

				}
			}
		}
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y}); // 큐에 첫번째 좌표 넣음
		visited[y][x] = true; //방문했다고 표시
		int size = 1; //사이즈 1로 지정

		while (!queue.isEmpty()) {
			int[] current = queue.poll(); //젤 밑에꺼 꺼냄

			int cx = current[0];
			int cy = current[1];

			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];

				if (nx < 1 || nx >= map[0].length || ny < 1 || ny >= map.length)
					continue;

				if (map[nx][ny] == 1 && !visited[ny][nx]) {
					visited[ny][nx] = true;
					queue.offer(new int[] {nx, ny});
					size++;
				}
			}
		}
		return size;
	}


}
