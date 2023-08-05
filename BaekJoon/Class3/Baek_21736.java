package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_21736 {
    static int S;
    static int G;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {-1, 0, 0, 1};
    static String[] map;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        //I 도연 => 73
        //X 벽 => 88
        //O 빈공간 => 79
        //P 사람 => 80

        // S G

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());

        map = new String[S];
        visited = new boolean[S][G];

        for (int i = 0; i < S; i++) {
            map[i] = br.readLine();
        }

        for (int i = 0; i < S; i++) {
            for (int j = 0; j < G; j++) {
                char tmp = map[i].charAt(j);
                if (tmp == 'I' && !visited[i][j]) {
                    visited[i][j] = true;
                    q.add(new int[]{j, i});
                    bfs();
                }
            }
        }
        if (cnt != 0) {
            System.out.println(cnt);
        } else System.out.println("TT");

    }

    static void bfs() {
        while (!q.isEmpty()) {
            int[] jp = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = jp[0] + dx[i];
                int y = jp[1] + dy[i];
                //좌표 밖을 벗어나거나 벽에 막혀있거나, 방문했으면 넘김
                if (x < 0 || y < 0 || x >= G || y >= S || visited[y][x] || map[y].charAt(x) == 'X') continue;
                else if (map[y].charAt(x) == 'O') {
                    q.add(new int[]{x, y});
                    visited[y][x] = true;
                }
                //p일때
                else {
                    visited[y][x] = true;
                    cnt++;
                    q.add(new int[]{x, y});
                }
            }
        }
    }
}
