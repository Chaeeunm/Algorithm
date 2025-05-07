package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//유저의 수
        int M = Integer.parseInt(st.nextToken());//친구관계의 수

        int[][] fw = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            fw[a][b] = fw[b][a] =1;
        }
        for(int i=1; i<=N; i++){ //i는 중간노드
            for(int j=1; j<=N; j++){
                for(int k=1; k<=N; k++){
                   // fw[j][k] = Math.min(fw[][])
                }
            }
        }


    }
}
