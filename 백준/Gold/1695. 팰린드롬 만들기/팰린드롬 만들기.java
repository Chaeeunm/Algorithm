import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[][] dp = new int[n][n]; //dp[start][end] = arr[start]부터 arr[end]까지의 구간을 팰린드롬으로 만들기 위해 필요한 최소 삽입 횟수
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i =0; i< n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i][i] = 0;
		}

		for(int len = 2; len<= n; len++){
			for(int start =0; start<=n-len; start++){
				int end = start + len -1;

				if(arr[start] == arr[end]){
					if(len > 2) dp[start][end] = dp[start +1][end -1];
					else dp[start][end] = 0;
				} else{
					dp[start][end] = Math.min(dp[start+1][end],dp[start][end-1]) + 1;
				}
			}
		}


		System.out.println(dp[0][n-1]);
	}
}
