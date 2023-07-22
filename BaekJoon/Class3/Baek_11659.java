package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11659 {
    public static void main(String[] args) throws IOException {
        //누적합 저장
        //구간 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer s = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(s.nextToken());
        int M = Integer.parseInt(s.nextToken());
        int[] sum = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=N; i++){
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0; i< M; i++){
            StringTokenizer c = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(c.nextToken());
            int end = Integer.parseInt(c.nextToken());
            int result = sum[end]-sum[start-1];
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
