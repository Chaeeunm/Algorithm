import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //값중 최댓값 M
        //(모든 값 합 / M ) *100

        float N = Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());
        float sum = 0;
        float max = 0;

        for(int i =0; i<N; i++){
            float num = Integer.parseInt(st.nextToken());
            sum += num;
            max = (max<num)?num:max;
        }
        System.out.println(sum / max * 100 / N);
    }
}
