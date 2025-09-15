import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int prelast = 0;
		int last = 0;
		int house = Integer.parseInt(br.readLine());
		int[][] dp = new int[house][3];
		StringTokenizer st;

		for(int i =0; i< house; i++){
			st = new StringTokenizer(br.readLine());
			dp[i][0] = Integer.parseInt(st.nextToken());
			dp[i][1] = Integer.parseInt(st.nextToken());
			dp[i][2] = Integer.parseInt(st.nextToken());
		}

		//dp[i]번쨰에 0 R 1 G 2 B를 선택했을떄 최솟값
		for(int i =1; i< house; i++) {
			dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);
		}
		int answer = Math.min(Math.min(dp[house-1][0], dp[house-1][1]),dp[house-1][2]);
		System.out.println(answer);
		}
		//dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + dp[i][0];
		//dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + dp[i][1];
		//dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + dp[i][2];


}
