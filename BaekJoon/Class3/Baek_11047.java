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
    }
    public static int count(){
        return 0;
    }
}
