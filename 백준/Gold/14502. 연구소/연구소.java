import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dRow = {-1,1,0,0};
	static int[] dCol = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		//7 7
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sero = Integer.parseInt(st.nextToken());
		int garo = Integer.parseInt(st.nextToken());
		int[][] map = new int[sero][garo];
		Queue<int[]> virus = new LinkedList<>();
		//List<int[]> zeroLoc = new ArrayList<>();
		int max = 0;
		int zeroCnt =0;

		for(int row = 0; row < sero; row++){
			st = new StringTokenizer(br.readLine());
			for(int col = 0; col < garo; col++){
				int now = Integer.parseInt(st.nextToken());
				map[row][col] = now;
				if(now == 0) zeroCnt++;
				if(now == 2) virus.offer(new int[]{row,col});
				//0 카운팅 = cnt
			}
		}

		//1부터 cnt 중에 3개 고름 for문 3개 or dfs 백트레킹
		for(int i  =1; i <= zeroCnt-2; i++){
			for(int j = i+1; j<= zeroCnt-1; j++){
				for(int k = j+1; k<= zeroCnt; k++){

					int nowZero = 0;
					int[][] tmp = new int[sero][garo];

					for(int row = 0; row < sero; row++){
						for(int col = 0; col < garo; col++){
							int now = map[row][col];
							if(now == 0) {
								nowZero++;
								if (nowZero == i || nowZero == j || nowZero == k) {
									tmp[row][col] = 1;
								}
							} else tmp[row][col] = now;
						}
					}

					max = Math.max(max,sprayVirus(tmp, virus));
				}
			}
		}

		System.out.println(max);
		//int[][]tmp만듦
		//map돌면서 tmp 에 넣고 0나올때마다 카운트 n번째로 나온 0에 1넣음

		//그걸 bfs돌리고 나온 넓이중 가장 넓은거 저장



	}

	private static int sprayVirus(int[][] tmp, Queue<int[]> virus){
		Queue<int[]> q = new LinkedList<>(virus);
		int safeZone = 0;
		while(!q.isEmpty()){
			int[] now = q.poll();
			for(int i =0; i<4; i++){
				int nextRow = now[0] + dRow[i];
				int nextCol = now[1] + dCol[i];
				if(nextCol >= tmp[0].length || nextCol <0 || nextRow >= tmp.length || nextRow <0) continue;
				if(tmp[nextRow][nextCol] == 0){
					tmp[nextRow][nextCol] = 2;
					q.offer(new int[]{nextRow, nextCol});
				}
			}
		}

		for(int row =0; row < tmp.length; row++){
			for(int col =0; col < tmp[0].length; col++){
				if(tmp[row][col] ==0) safeZone++;
			}
		}
		return safeZone;
	}

}
