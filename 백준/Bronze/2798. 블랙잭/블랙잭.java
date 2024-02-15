
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[] cards= new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        //3개 골라서 M과의 차가 더 작으면 저장
        for(int i=0; i<N; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int result = -1;

        for(int i =0; i<N-2; i++) {
            int f = cards[i];
            for(int j = i+1 ; j<N-1; j++){
                int s = cards[j];
                for(int k = j+1; k<N; k++ ) {
                int t = cards[k];
                if(result == -1){
                    if(M>= (f+s+t))
                    result = f+s+t;
                }
                if(M>= (f+s+t) && M-result > M-(f+s+t)){
                    result = f+s+t;
                }
                }
            }
        }
        System.out.println(result);
    }
}
