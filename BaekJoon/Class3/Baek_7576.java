package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_7576 {
    static int[][] box;
    static int cnt;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int N;
    static int M;
    static Queue<int[]> q = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        box = new int[N][M];


        //1 익토 / 0안익토 / -1없토
        for (int i = 0; i < N; i++) {
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[N][M] == 1) { //토마토가 익어있으면 주변 토마토도 익게 하고, count++;
                    q.add(new int[]{i,j});
                }
            }
        }
        bfs();
        System.out.println();
    }

    static void bfs() {
        while (!q.isEmpty()){
            int[] t =q.poll();
            int x = t[0];
            int y = t[1];
            change(x,y);
        }
    }

    static boolean checkTomato() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

        //모든 구역을 탐색(모두 익을 때까지)
        static void change(int x, int y) {
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a < 0 || b < 0 || a > N || b > M) {
                    continue;
                }
                if (box[a][b] == 0) box[a][b] = 1;
                q.add(new int[]{a, b});
            }
        }
    }