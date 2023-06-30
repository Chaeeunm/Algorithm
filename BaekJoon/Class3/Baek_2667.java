package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2667 {

    static int[][] dj;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<int[]> q = new LinkedList();
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList ar = new ArrayList();
        //1 => 집 ㅇ 2 => 집 x
        //연결 => 집이 좌우, 상하로 다른 집이 있는 경우! (대각선 X)
        //각 단지에 속하는 집의 수를 오름차순 정렬

        N = Integer.parseInt(br.readLine());
        dj = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            for (int j = 0; j < N; j++) {
                dj[i][j] = Integer.parseInt(String.valueOf(a.charAt(j)));
            }
        }
        int dc =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && dj[i][j] == 1) {
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                    ar.add(bfs());
                    dc++;
                }
            }
        }

        Object[] result = ar.stream().sorted().toArray();
        sb.append(dc).append('\n');

        for(int i=0; i<result.length; i++){
            sb.append(result[i]).append('\n');
        }
        System.out.println(sb);
    }

    static int bfs() {
        int count = 0;
        while (!q.isEmpty()) {
            int[] t = q.poll();
            count++;//q에서 하나 꺼낼때마다 count++
            for (int i = 0; i < 4; i++) {
                    int y = t[0] + dy[i];
                    int x = t[1] + dx[i];
                    if (y < 0 || x < 0 || y >= N || x >= N) {
                        continue;
                    }
                    if (!visited[y][x] && dj[y][x] == 1) {//방문 안했고, 집이 있으면
                        visited[y][x] = true;
                        q.add(new int[]{y, x});
                    }
            }
        }
        return count;
    }
}
//오름차순 정렬
//문제 : 대각선에 있는 집까지 count해버림