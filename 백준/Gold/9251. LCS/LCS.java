import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		int max = 0;

		int[][] dp = new int[a.length()][b.length()];
		if(a.charAt(0) == b.charAt(0)) dp[0][0] = 1;

		//첫줄채우기
		for(int aIdx = 1; aIdx < a.length(); aIdx++){
			if(a.charAt(aIdx) == b.charAt(0)|| dp[aIdx-1][0] ==1) dp[aIdx][0] = 1;
		}
		for(int bIdx = 1; bIdx < b.length(); bIdx++){
			if(a.charAt(0) == b.charAt(bIdx)|| dp[0][bIdx-1] ==1) dp[0][bIdx] = 1;
		}

		for(int aIdx = 1; aIdx < a.length(); aIdx++){
			for(int bIdx = 1; bIdx < b.length(); bIdx++){
				if(a.charAt(aIdx) == b.charAt(bIdx)) {
					dp[aIdx][bIdx] = Math.max(dp[aIdx - 1][bIdx - 1] + 1, dp[aIdx - 1][bIdx]);
				} else {
					dp[aIdx][bIdx] = Math.max(dp[aIdx - 1][bIdx], dp[aIdx][bIdx-1]);
				}
			}
		}

		for(int aIdx = 0; aIdx < a.length(); aIdx++){
			for(int bIdx = 0; bIdx < b.length(); bIdx++){
				max = Math.max(dp[aIdx][bIdx], max);
			}
		}

		System.out.println(max);
	}
}
