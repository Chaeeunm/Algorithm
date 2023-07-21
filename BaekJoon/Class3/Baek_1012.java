package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_1012 {
    //방문하지 않았고, 1일 때마다 큐에 넣고
    //상하좌우 를 돌아줌
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {-1, 0, 0, 1};
    static boolean[][] field;

    static Queue<int[]> q = new LinkedList<>();

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());//가로
            int S = Integer.parseInt(st.nextToken());//세로
            int K = Integer.parseInt(st.nextToken()); //위치개수

            field = new boolean[S][G];

            cnt = 0; // cnt 초기화

            for (int i = 0; i < K; i++) {
                StringTokenizer c = new StringTokenizer(br.readLine());
                //X Y
                int X = Integer.parseInt(c.nextToken());
                int Y = Integer.parseInt(c.nextToken());

                field[Y][X] = true; //배추 심어줌
            }

            for (int i = 0; i < S; i++) {
                for (int j = 0; j < G; j++) {
                    if (field[i][j]) {
                        field[i][j] = false;
                        q.add(new int[]{j, i});
                        bfs(j, i); //j 가로 i 세로
                        cnt++; //bfs 한바퀴 돌고나면 cnt++
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        while (!q.isEmpty()) {
            int[] cab = q.poll();
            //상하좌우 돌면서 1이고 방문하지 않았으면 q에 담아줌
            for (int i = 0; i < 4; i++) {
                int a = cab[0] + dx[i];
                int b = cab[1] + dy[i];
                if (a >= 0 && a < field[0].length && b >= 0 && b < field.length && field[b][a]) {
                    field[b][a] = false;
                    q.add(new int[]{a, b});
                }
            }
        }
    }
}
