import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] box;
    static int cnt;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int N;
    static int M;
    static Queue<int[]> q = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];

        //1 익토 / 0안익토 / -1없토
        for (int i = 0; i < N; i++) {
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    q.add(new int[]{i,j});
                }
            }
        }
        bfs();
        countDay();
        cnt = checkTomato()?cnt:-1;
        System.out.println(cnt);
    }

    static void bfs() {
        while (!q.isEmpty()){
            int[] t =q.poll();
            int x = t[0];
            int y = t[1];
            change(x,y);
        }
    }
//안익은 토마토가 있으면 false 출력
    static boolean checkTomato() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    static int countDay(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                cnt = Math.max(cnt,box[i][j]-1);
                }
            }
        return cnt;
    }

    //상하좌우중 0이 있으면 q에 넣고 depth+1
     static void change(int x, int y) {
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a < 0 || b < 0 || a >= N || b >= M) {
                    continue;
                }
                if (box[a][b] == 0) {
                    box[a][b] = box[x][y] + 1;
                    q.add(new int[]{a, b});
                }
            }
        }
    }