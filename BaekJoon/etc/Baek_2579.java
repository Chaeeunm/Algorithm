package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2579 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] dp  = new int[N+1][3];
        dp[0][0] = dp[0][1] = dp[0][2] =0;

        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(br.readLine());

            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]); //이전 한칸 밝았을 때와 두칸 밝았을 때중 최댓값(두번 연속 안밝는 경우는 없음)
            dp[i][1] = dp[i-1][0] + num; // 이전에 안밝았던 경우 + 현재 계단 점수
            dp[i][2] = dp[i-1][1] + num; // 이전에 한번 밝았을 경우 점수 + 현재 계단 점수
        }

        System.out.println(Math.max(dp[N][1],dp[N][2]));

    }
}
