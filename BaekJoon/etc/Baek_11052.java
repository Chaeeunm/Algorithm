package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11052 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] prices = new int[n+1];
		int[] dp = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n+1; i++ ) {
			prices[i] = Integer.parseInt(st.nextToken());
		}
		dp[1] = prices[1];

		for(int i =2; i < n+1; i++) {
			for(int j = 1; j <= i; j++) {
					dp[i] = Math.max(dp[i], dp[i - j] + prices[j]);
			}
		}

		System.out.println(dp[n]);
	}
}
