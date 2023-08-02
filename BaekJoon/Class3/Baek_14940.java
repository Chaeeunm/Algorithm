package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_14940 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int G;
    static int S;

    static boolean[][] visited;

    static int[][] map;

    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        //세로 가로
        //0 갈 수 없는 땅 1 갈 수 있는 땅 2 목표지점
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());

        visited = new boolean[S][G];
        map = new int[S][G];

        for (int i = 0; i < S; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int stx =0;
        int sty =0;
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < G; j++) {
                if (map[i][j] == 2) {
                    map[i][j] = 0;
                    sty = i;
                    stx = j;
                    break;
                }
            }
        }
        q.add(new int[]{stx, sty});
        visited[sty][stx] = true;
        bfs(stx, sty);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < G; j++) {
                if (visited[i][j]) {//방문했으면
                    result.append(map[i][j]).append(" ");
                } else if (map[i][j] == 0) {
                    result.append(0).append(" ");
                } else result.append(-1).append(" ");
            }
            result.append('\n');
        }
        System.out.println(result);
    }

    static void bfs(int x, int y) {
        while (!q.isEmpty()) {
            int[] jp = q.poll();
            int depth = map[jp[1]][jp[0]];
            for (int i = 0; i < 4; i++) {
                int a = jp[0] + dx[i];//a는 x좌표 즉 G
                int b = jp[1] + dy[i];//b는 y좌표 즉 S 를 벗어나면 안됨
                if (a >= 0 && b >= 0 && a < G && b < S && !visited[b][a] && map[b][a] == 1) {//방문하지 않았고, map 밖을 벗어나지 않았으며 값이 1이라면?
                    visited[b][a] = true;
                    q.add(new int[]{a, b});
                    map[b][a] = depth + 1;
                }
            }
        }
    }


}

//돌면서 2 일때 넣고, 거기서 상하좌우로 움직이며 거리수 계산 후 출력

//0이면 continue 1이면 숫자로 바꾸고

// 도달할 수 없는 위치는 -1을 출력한다. 방문여부 false 인 경우 -1 출력
