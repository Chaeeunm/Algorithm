import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BigInteger[] dp = new BigInteger[31];
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        dp[1] = BigInteger.valueOf(1);
        //dp[n] = n*dp[n-1]
        while (tc-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(bridge(n,m)).append("\n");
        }
        System.out.println(sb);
    }
    static BigInteger bridge(int n, int m){
        if(n==m) return BigInteger.valueOf(1);
        return factorial(m).divide(factorial(n).multiply(factorial(m-n)));
    }
    static BigInteger factorial(int num){
        if(dp[num]!=null) return dp[num];
        return dp[num] = BigInteger.valueOf(num).multiply(factorial(num-1));
    }
}
