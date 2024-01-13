import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long max = Math.max(a,b);
        long min = Math.min(a,b);

        long num = (max - min +1);
        long result;

        if(a == b ){
            result = a;
        }
        else if(num %2 == 0 ){
            result = (max+min) * (num/2);
        }
        else {
            result = (max + min) * (num / 2) + (max + min) / 2;
        }
        System.out.println(result);
    }
}
