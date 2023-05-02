import java.io.IOException;
import java.util.Scanner;

//이항계수 2
public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        dp = new int[N+1][N+1];
        System.out.println(eg(N,K));
    }
    static int eg(int N, int K){
        if(K==0||N==K) return 1;
        else if(dp[N][K]!=0) return dp[N][K];
        return dp[N][K] = (eg(N-1,K-1)+eg(N-1,K))%10007;
    }
}
