
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] family;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        family = new int[A+1][A+1];
        check = new boolean[A+1];

        while (N-->0){
            st = new StringTokenizer(br.readLine()," ");
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            family[a][b] = family[b][a] =1;
        }
        System.out.println(cd(S,E,0));


    }
    static int cd(int start,int end,int cnt){
        if(start==end) return cnt;
        check[start] = true; //방문했다고 표시하고
        for(int i=1; i< check.length; i++){
            if(family[start][i]==1&&!check[i]){ //start와 연결되어있으면서 방문하지 않았다면
                check[i] = true;
                int temp = cd(i,end,cnt+1);
                if(temp!=-1) return temp;
            }
        }
        return -1;
    }
}
