package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = N;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i =0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());


            if(num ==1) {
                cnt --;
            }
            //각 수마다 소수인지 감별
            for(int j = num-1; j>=2; j--){
                if(num % j ==0){ //1과 자기 자신을 제외한 수중에 나누어 떨어지는 수가 있으면 = 소수가 아니면
                    cnt--; //CNT에 1 뺴준 후 반복문 탈출
                    break;
                }
            }

        }
        System.out.println(cnt);
    }
}
