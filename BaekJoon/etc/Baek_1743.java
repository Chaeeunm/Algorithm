package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1743 {

	static int[][] bokdo;
	static boolean[][] visited;
	static int[] xCnt = {-1,0,0,1};
	static int[] yCnt = {0,1,-1,0};

	static int nowSize= 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sero = Integer.parseInt(st.nextToken());
		int garo = Integer.parseInt(st.nextToken());
		int foodNum = Integer.parseInt(st.nextToken());
		int maxSize = 0;

		bokdo = new int[sero+1][garo+1];
		visited = new boolean[sero+1][garo+1];

		while (foodNum -->0) {
			st = new StringTokenizer(br.readLine());
			int foodY = Integer.parseInt(st.nextToken());
			int foodX = Integer.parseInt(st.nextToken());
			bokdo[foodY][foodX] = 1;
		}

		for(int y =1; y< sero+1; y++) {
			for(int x =1; x< garo+1; x++) {
				if(bokdo[y][x] == 1 && !visited[y][x]){
					nowSize = 0;
					calculateFoodSize(x,y);
					maxSize = Math.max(maxSize,nowSize);
				}
			}
		}

		System.out.println(maxSize);

	}

	public static void calculateFoodSize(int x, int y) {
		if(visited[y][x]){
			return;
		}
		visited[y][x] =true;
		nowSize++;

		for(int i =0; i<4; i++) {
			int nowX = x + xCnt[i];
			int nowY = y + yCnt[i];

			if(nowX < 1 || nowX > bokdo[0].length-1 ||nowY  < 1 || nowY > bokdo.length-1) {continue;}
			if(bokdo[nowY][nowX] ==1 && !visited[nowY][nowX]) {
				calculateFoodSize(nowX, nowY);
			}
		}
	}
}
