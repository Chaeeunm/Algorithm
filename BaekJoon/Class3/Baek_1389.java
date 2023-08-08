package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Baek_1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//유저의 수
        int M = Integer.parseInt(st.nextToken());//친구관계의 수

        int[][] friends = new int[N+1][N+1];
        int[][] fw = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            friends[a][b] = friends[b][a] = 1;
        }


    }
}