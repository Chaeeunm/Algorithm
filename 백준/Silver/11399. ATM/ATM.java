
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//오름차순 정렬
//arr[0] * N + arr[1] * N-1 ..... arr[N-1] * 1
public class Main {
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //오름차순
        System.out.println(ATM(N));
    }

    static int ATM(int N){
        int sum =0;
        int i =1;
        while (N > 0 ){
            sum += arr[--N] * i;
            i++;
        }
        return sum;
    }
}
