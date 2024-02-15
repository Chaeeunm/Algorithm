import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        int bestScore = 0;
        int sum =0;

        for(int i=0; i<N; i++){
            int ns = Integer.parseInt(st.nextToken());
            if(bestScore < ns) bestScore = ns;
            sum += ns;
        }

        BigDecimal sumDecimal = new BigDecimal(String.valueOf(sum));
        BigDecimal bestScoreDecimal = new BigDecimal(String.valueOf(bestScore));

        BigDecimal result = sumDecimal.divide(bestScoreDecimal,6,BigDecimal.ROUND_HALF_UP).divide(new BigDecimal(String.valueOf(N)),6,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));


        System.out.println(result);

        //최댓값 점수 구하기
        //((모든 점수) / 점수 중 최댓값 ) *100
    }
}