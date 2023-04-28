package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_1260 {
    static Queue<Integer> q= new LinkedList<>();
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        while(M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(V);
        //방문 배열 초기화해줌
        for(int i=0;i<visited.length;i++) {
            visited[i] = false;
        }
        sb.append("\n");
        bfs(V);
        System.out.println(sb);
    }
    static void bfs(int start){
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()){
            int num = q.poll();
            sb.append(num).append(" ");

            for(int j=1; j<visited.length; j++){
                if(graph[num][j]==1&&visited[j]==false){
                    q.add(j);
                    visited[j] =true;
                }
            }
        }
    }
    static void dfs(int start){
        if(visited[start]) return;
        visited[start] =true; //그렇지 않으면 방문했다고 표시하고
        sb.append(start).append(" ");

        for(int i=1; i<visited.length; i++){
            if(graph[start][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
