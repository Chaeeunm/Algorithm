
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //의견 X -> 난의도 0
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        //double sum = 0
        double sum = 0;
        int result = 0;
        //double b = N명에 3/20 반올림 한 수
        double b = Math.round(((double)N) * (3.0/20.0));
        int intB = (int) b;
        //for(int i= b; i< N-b; i++)
        //배열 안 수 sum 에 더함
        //result = sum / (2*b)

        double[] level = new double[N];

        for(int i=0; i<N; i++){
            level[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(level);
        for(int i= intB; i< N - intB; i++) {
            sum += level[i];
        }
        if(N != 0) result = (int)Math.round(sum / ((double)N - (2.0 * b)));
        System.out.println(result);
    }
}
