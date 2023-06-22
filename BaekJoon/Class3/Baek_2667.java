package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2667 {

    static int[][] danji;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1 => 집 ㅇ 2 => 집 x
        //연결 => 집이 좌우, 상하로 다른 집이 있는 경우! (대각선 X)
        //각 단지에 속하는 집의 수를 오름차순 정렬

        int N = Integer.parseInt(br.readLine());
        danji = new int[N][N];
        for(int i=0; i<N;i++){
            String a = br.readLine();
            for(int j=0; j<0; j++) {
                danji[i][j] = Integer.parseInt(String.valueOf(a.charAt(j)));
            }
        }


    }
}
