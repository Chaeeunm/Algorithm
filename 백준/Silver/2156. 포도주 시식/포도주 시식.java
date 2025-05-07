
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] graphs;
	static int[] dp;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		graphs = new int[n];
		dp = new int[n];

		Arrays.fill(dp, -1);
		for(int i =0; i<n; i++) {
			graphs[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = graphs[0];
		if(n > 1) {
			dp[1] = graphs[0] + graphs[1];
		} //dp[n-1] , dp[n-2] + dp[n-3]
		if(n > 2) {
			dp[2] = Math.max(dp[1], Math.max(dp[0] + graphs[2], graphs[1] + graphs[2]));

		}//필요한거
		// 1. dp[] <- 최댓값 배열
		// 2. graphs[] -> 포도주잔 든 배열

		//				dp[n]
		//          최대 + X :  dp[n-1]
		//     최대 + X + O  :  dp[n-2] +  graphs[n]
		// 최대 + X + O + O  :  dp[n-3] + graphs[n-1] + graphs[n]
		//중 최댓값



		System.out.println(drink(n-1));
	}

	public static int drink(int n){
		if(n<0) return 0;
		if(dp[n] != -1 ) {
			return dp[n];
		}
		return dp[n] = Math.max(drink(n-1) ,
			Math.max(drink(n-2)  + graphs[n],
				drink(n-3) + graphs[n-1] + graphs[n]));
	}
}
