import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int result = N;

        for(int i =0; i<N; i++){
            int a= Integer.parseInt((arr[i]));
            if(a==1){ //a가 1이면
                result--; //소수가 아님
            }
            for(int j = a-1; j>1; j--){ //소수 :1보다 큰 수중 1과 자신만을 약수로 갖는 수
            if(a%j==0){ //만약 i번째 수가 j로 나누어진다면(소수가 아니라면)
                result--; //result에 1을 빼줌
                break;
                }
            }
        }
        System.out.println(result);
    }
}