package Class2;
//소수찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=N;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            int A = Integer.parseInt(st.nextToken());
            //이제 수 A가 소수(1과 자기 자신만으로 나누어떨어지는 수)인지 아닌지 판별할 거임
            for(int j=2; j<Math.sqrt(A); j++){
                if(A%j==0) { //A가 1이 아닌 수로 나누어 떨어진다면(소수가 아니라면)
                    count--; //count에서 하나 빼줌
                    break; //반복문 중지
                }
            }
        }
        System.out.println(count);
    }
}
