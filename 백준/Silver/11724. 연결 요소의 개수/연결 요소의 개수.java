import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    static boolean[] visited;
    static int[][]graph;

    public static void main(String... args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N =  Integer.parseInt(st.nextToken()); //정점의 갯수
        int M = Integer.parseInt(st.nextToken()); //간선의 갯수

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        while(M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        for(int j=1; j<=N; j++){
            if(!visited[j]) {
                dfs(j);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //1부터 visited길이까지 돌며 방문했으면 return,
    static void dfs(int start){
        if(visited[start]) return;

        //그렇지 않다면 방문 표시하고 start와 연결된 요소들 하나씩 방문해줌
        visited[start] =true;
        for(int i=1; i<visited.length; i++){
            if(graph[start][i]==1&&!visited[i]){
                dfs(i);
            }
        }
    }

}
