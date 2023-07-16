package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11047 {
    static int[] coin;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        coin = new int[N];

        for (int i=0; i< N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int cnt =0;
        //오름차순이므로 뒤에서부터 반복
        for(int i=N-1; i>=0; i--){
            if(K==0) break;
            if (K >= coin[i]) {
                cnt += K / coin[i]; //동전의 개수 더해주기
                K %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
