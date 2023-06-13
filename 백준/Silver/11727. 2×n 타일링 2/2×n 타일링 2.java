
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        dp[1] =1;
        if(N>1) dp[2] = 3;
        if(N>2) dp[3] =5;

        System.out.println(count(N));
    }
    static int count(int N){
        if(dp[N]!=0) return dp[N];
        return dp[N] = (count(N-1)+ count(N-2)*2)%10007;
    }
}
