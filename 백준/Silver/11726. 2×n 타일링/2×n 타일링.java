
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//규칙
//dp[1] = 1 / dp[2] = 2 / dp[3] = dp[2] + 2*dp[1] - dp[1]
//dp[n] = d[n-1] + dp[n-2]
public class Main {
    static int[] dp = new int[1001];
    public static void main(String[] args) throws IOException {
        dp[1] = 1;
        dp[2] = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        System.out.println(tiling(l));
    }

    static int tiling(int l){
        if(l<3||dp[l]!=0) return dp[l];
        return dp[l] = (tiling(l-1) + tiling(l-2))%10007;
    }
}

