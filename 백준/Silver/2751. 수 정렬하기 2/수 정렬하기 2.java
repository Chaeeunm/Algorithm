import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean count[] = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N ; i++){
            count[Integer.parseInt(br.readLine())+1000000] = true;
        }
        for(int i=0;i<2000001; i++){
            if(count[i])sb.append(i-1000000).append('\n');
        }
        System.out.println(sb);
    }
}