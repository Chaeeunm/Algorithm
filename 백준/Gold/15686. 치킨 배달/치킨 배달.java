import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp;
	static int r;
	static boolean[] visited;
	static int chickenMax;
	static int answer = 2500;
	static ArrayList<int[]> houses = new ArrayList<>();


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		chickenMax = Integer.parseInt(st.nextToken());
		ArrayList<int[]> chickens = new ArrayList<>();

		for(int row =0; row < r; row++){
			st = new StringTokenizer(br.readLine());
			for(int col =0; col<r; col++){
				int now = Integer.parseInt(st.nextToken());
				if(now == 1){
					houses.add(new int[]{row,col});
				}
				if(now ==2){
					chickens.add(new int[]{row,col});
				}
			}
		}

		visited = new boolean[chickens.size()];

		dp = new int[houses.size()][chickens.size()];

		for(int h = 0; h < houses.size(); h++){
			for(int c = 0; c< chickens.size(); c++){
				int[] nowHouse = houses.get(h);
				int[] nowChicken = chickens.get(c);
				dp[h][c] = Math.abs(nowHouse[0] - nowChicken[0]) +  Math.abs(nowHouse[1] - nowChicken[1]);
			}
		}

		pickChicken(0,0);
		System.out.println(answer);

		//치킨집 고르기
		//chickens.sizeCchickenMax


		//dp[집의개수][치킨집수]
		//각 집의 위치 저장 2N
		//각 치킨집 위치 저장 c
		//치킨집 고르는 경우의 수 13Cc
		//각 집에서의 치킨집까지의 거리 중 젤작은거 저장 2n*c
	}

	public static int chickenLocation(int houseNum){
		//남아있는 치킨집 중 거리가 가장 작은 치킨 거리 구하기
		int result = 2*r;
		for (int j =0; j< visited.length; j++) {
			if(visited[j]) {
				result = Math.min(dp[houseNum][j], result);
			}
		}
		return result;
	}

	//maxChicken개 고르기
	//약간 백트레킹 가튼데
	public static void pickChicken(int start , int depth){
		//depth == chickenMax 도달하면 각 하우스에서 chickenLocation으로 최소 치킨거리 갱신
		if(depth == chickenMax) {
			int nowAnswer = 0;
			for(int i  =0; i< houses.size(); i++){
				nowAnswer += chickenLocation(i);
			}
			answer = Math.min(nowAnswer, answer);
		} else {
			for(int i = start ; i< visited.length; i++) {
				if (!visited[i]){
					visited[i] = true;
					pickChicken(start+1, depth+1);
					visited[i] = false;
				}
			}
		}
		//치킨집 모든 경우의 수 백트레킹으로 구함

		//answer과 MIN중 더작은값 갱신

	}


}