
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static boolean[][] visited = new boolean[2001][2001];
	static int s;
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();

		bfs(1,0,0);
	}
	public static void bfs(int nowCnt, int copyCnt, int time){
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{nowCnt,copyCnt,time});

		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			if(now[0] == s) {
				System.out.println(now[2]);
				return;
			}
			if(!visited[now[0]][now[0]]) {
				visited[now[0]][now[0]] =true;
				queue.offer(new int[] {now[0], now[0], now[2] + 1}); //copy
			}
			if(now[0]+now[1] < 2001 && !visited[now[0]+now[1]][now[1]]) {
				visited[now[0]+now[1]][now[1]] = true;
				queue.offer(new int[] {now[0] + now[1], now[1], now[2] + 1}); //paste
			}
			if(now[0] > 1 && !visited[now[0]-1][now[1]]) {
				visited[now[0]-1][now[1]] = true;
				queue.offer(new int[] {now[0] - 1, now[1], now[2] + 1}); //minus
			}

		}

	}

}
