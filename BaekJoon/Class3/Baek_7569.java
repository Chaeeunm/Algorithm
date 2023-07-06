package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    static int cnt;
    static int[][][] box;
    static int[] dx = {0,0,1,-1,0,0};
    static int[] dy = {1,-1,0,0,0,0};
    static int[] dz = {0,0,0,0,1,-1};
    static Queue<tomato> q = new LinkedList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        M = Integer.parseInt(st.nextToken());//가로
        N = Integer.parseInt(st.nextToken());//세로
        H = Integer.parseInt(st.nextToken());//높이

        box = new int[H][N][M];

        for(int i=0;i<H; i++){
            for(int j=0; j<N; j++){
                box[i][j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
        }

        if(checkTomato()) System.out.println(0);
        else {

            for (int i = 0; i < H; i++) { //높이
                for (int j = 0; j < N; j++) { //세로
                    for (int k = 0; k < M; k++) { //가로
                        if (box[i][j][k] == 1) {
                            q.add(new tomato(k, j, i));
                        }
                    }
                }
            }
            bfs();
            countDay();
            cnt = checkTomato() ? cnt : -1;
            System.out.println(cnt);
        }

    }
    public static void bfs(){
        while (!q.isEmpty()){
            tomato t = q.poll();
            int x = t.x;
            int y = t.y;
            int z = t.z;
            change(x,y,z);
        }
    }

    static boolean checkTomato() {
        for (int i = 0; i < H; i++) { //높이
            for (int j = 0; j < N; j++) { //세로
                for (int k = 0; k < M; k++) { //가로
                    if(box[i][j][k] ==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    static int countDay(){
        for (int i = 0; i < H; i++) { //높이
            for (int j = 0; j < N; j++) { //세로
                for (int k = 0; k < M; k++) { //가로
                    cnt = Math.max(cnt,box[i][j][k]-1);
                    }
                }
            }
        return cnt;
    }

    //상하좌우 위 아래 중 0이 있으면 q에 넣고 depth +1
    static void change(int x, int y, int z){
        for(int i =0; i<6; i++){
            int a = x + dx[i];
            int b = y + dy[i];
            int c = z + dz[i];
            if(a<0||b<0||c<0||a>=M||b>=N||c>=H){
                continue;
            }
            if(box[c][b][a] ==0){
                box[c][b][a] = box[z][y][x] +1;
                q.add(new tomato(a,b,c));
            }
        }
    }
}
