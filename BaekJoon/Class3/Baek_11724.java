package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_11724 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //정점의 갯수
        int M = Integer.parseInt(st.nextToken()); //간선의 갯수
        Queue<Integer> q = new LinkedList();
        int cnt = 0;

        int[][] graph = new int[N + 1][N + 1];
        boolean[] visited = new boolean[N + 1];

        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        //BFS 방식
        //1부터 돌면서 방문하지 않았다면 q에 넣고 방문 표시해주고 count++
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;
                cnt++;
            }
            //이제 i와 연결된 수들을 q에 넣으며 q가 빌 때까지 반복해 줄 것임
            while (!q.isEmpty()) {
                int num = q.poll(); //q의 젤 위의 수 빼줌
                for (int j = 1; j <= N; j++) {
                    if (graph[num][j] == 1 && !visited[j]) { //i에서 j로 가는 길이 있고, 방문한 적이 없으면 방문해주고 q에 넣음
                        visited[j] = true;
                        q.add(j);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
