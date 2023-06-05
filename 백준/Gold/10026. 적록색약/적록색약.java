
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//적록색약
public class Main {

    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    static char[][] drawing;
    static boolean[][] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int cnt =0;
        int WNCnt =0;

        visited = new boolean[N+1][N+1];
        drawing = new char[N+1][N+1];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                drawing[i][j] = s.charAt(j);
            }
        }

        for(int i=0; i< N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(drawing[i][j]=='G'){
                    drawing[i][j] ='R';
                }
            }
        }
        visited = new boolean[N+1][N+1];
        for(int i=0; i< N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    WNCnt++;
                }
            }
        }


        System.out.println(cnt+" "+WNCnt);
    }
    static void dfs(int x, int y){
        visited[x][y] = true;
        char tmp = drawing[x][y];
        for(int i=0; i<4; i++){
            int a = x+ dx[i];
            int b = y+ dy[i];
            if(a<0||b<0||a>N||b>N){//테두리를 벗어나면 continue
                continue;
            }
            if(!visited[a][b]&&drawing[a][b]==tmp) { //아직 방문하지 않았고,tmp와 같은 색이려면
                dfs(a, b);
            }
        }
    }
}
