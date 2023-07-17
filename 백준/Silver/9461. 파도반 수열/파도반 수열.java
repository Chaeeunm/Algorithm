import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //규칙 111 22 주어짐 . dp[n] = dp[n-1] + dp[n-5]
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            dp = new long[n + 1];
            dp[1] = 1;
            if (n > 1) dp[2] = 1;
            if (n > 2) dp[3] = 1;
            if (n > 3) dp[4] = 2;
            if (n > 4) dp[5] = 2;
            sb.append(count(n)).append('\n');
        }

        System.out.println(sb);

    }

    public static long count(int n) {
        if (dp[n] != 0) return dp[n];
        else return dp[n] = count(n - 1) + count(n - 5);
    }
}
