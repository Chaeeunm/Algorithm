package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_7576 {
    static int[][] box;
    static boolean[][] visited;
    static int cnt;
    static int[] dx={-1,0,0,1};
    static int[] dy ={0,-1,1,0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        box = new int[N][M];
        visited = new boolean[N][M];

        //1 익토 / 0안익토 / -1없토
        for (int i = 0; i < N; i++) {
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for(int i=0; i< N; i++){
            for(int j=0; j<M; j++){
                if(box[N][M]==1) { //토마토가 익어있으면 주변 토마토도 익게 하고, count++;
                    dfs(j, i);
                }
            }
        }
    }
    //모든 구역을 탐색(모두 익을 때까지)
    static void dfs(int x, int y){

    }
    //상하좌우를 넣어줌..?
}