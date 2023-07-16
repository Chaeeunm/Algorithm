package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_17626 {

    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];

        dp[1] = 1; // 1제곱
        System.out.println(count(n));
    }
    static int count(int n) {
        if (dp[n] != 0) return dp[n]; //한번 계산한 값이면 출력

        for (int i = (int)Math.sqrt(n); i > 0; i--) {
            if(dp[n] ==0) {
                dp[n] = 1 + count(n - (i * i));
            }
            dp[n] = Math.min(dp[n], 1 + count(n - (i * i)));
        }
        return dp[n];
    }
}
