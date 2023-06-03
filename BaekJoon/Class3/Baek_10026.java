package BaekJoon.Class3;

import javafx.scene.chart.BubbleChart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//적록색약
public class Baek_10026 {

    static int[] dx = {-1,0,0,1};
    static int[] dy = {-1,0,0,1};
    static char[][] drawing;
    static boolean[][] visited;
    static int cnt = 0;
    static int cntWeakness = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N+1][N+1];
        drawing = new char[N+1][N+1];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                drawing[i][j] = s.charAt(j);
            }
        }
    }
    static void dfs(int x, int y){

    }

}
