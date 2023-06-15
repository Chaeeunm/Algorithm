package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class tomato{
    int x;
    int y;
    int z;
    tomato(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Baek_7569 {
    static int M;
    static int N;
    static int H;
    static int[][][] box;
    static Queue<tomato> q = new LinkedList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        M = Integer.parseInt(st.nextToken());//가로
        N = Integer.parseInt(st.nextToken());//세로
        H = Integer.parseInt(st.nextToken());//높이

        box = new int[H][N][M];


        for(int i =0; i<H; i++){
            for(int j =0; j<N; j++){
                for(int k=0; k<M; k++){

                }
            }
        }

    }
    public static int bfs(){

    }
}
