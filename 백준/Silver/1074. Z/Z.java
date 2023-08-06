import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()); //행 y좌표
        int a = Integer.parseInt(st.nextToken()); //열 => 세로줄 .x좌표

        int n = (int) Math.pow(2,N);
        z(a,b,n);
        System.out.println(cnt);

    }

    static void z(int a, int b,int n){
        int s = n/2;//0123 4567
        if(n==1) return;
        //1사분면일때
        else if(a<s&&b<s){
            z(a,b,s);
        }
        //2사분면일때
        else if(a>=s&&b<s){
            cnt += s*s;
            z(a-s,b,s);
        }//3사분면일때
        else if (a<s&&b>=s) {
            cnt += s*s*2;
            z(a,b-s,s);
        }//4사분면일때
        else if (a>=s&&b>=s) {
            cnt+= s*s*3;
            z(a-s,b-s,s);
        }
    }
}
