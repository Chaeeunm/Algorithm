
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //N+1개의 I와 N개의 O
        //I와 O이 교대로 나오는 문자열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String S = br.readLine();

        int count =0;

        for(int i=0; i<M-2*N; i++) {
            if (S.charAt(i) == 'I') { //만약 i번째 수가 I면 다음수가 O
                for(int j=i+1; j<2*N+i; j+=2){ //j=5 j<6
                    if(S.charAt(j)!='O'||S.charAt(j+1)!='I'){
                        break;
                    }
                    if(j==2*N+i-1) count++;
                }
            }
            //스트링을 돌며 I로 시작하는 경우를 찾음
            //OI가 연속으로 N만큼 들어있는지 확인
        }
        System.out.println(count);
        }
}
