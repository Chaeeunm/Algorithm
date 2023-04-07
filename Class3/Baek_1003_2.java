package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1003_2 {
    static int[][] dp = new int[41][2];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            fibonacci(num);
            sb.append(dp[num][0]).append(" ").append(dp[num][1]).append('\n');
        }
        System.out.println(sb);
    }

    public static int[] fibonacci(int num) {
        if (dp[num][0] > 0 || dp[num][1] > 0) return dp[num];
        else {
            dp[num][0] = fibonacci(num-1)[0] + fibonacci(num-2)[0];
            dp[num][1] = fibonacci(num-1)[1] + fibonacci(num-2)[1];
            return dp[num];
        }
    }
}
