import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(bridge(n, m)).append("\n");
        }
        System.out.println(sb);
    }

    static int bridge(int n, int m) {
        if (n == m || n == 0) return 1;
        else if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] = bridge(n - 1, m - 1) + bridge(n, m - 1);
    }
}
