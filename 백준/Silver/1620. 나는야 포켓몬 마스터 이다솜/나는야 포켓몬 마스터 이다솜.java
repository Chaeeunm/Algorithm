
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        HashMap<Integer,String> pocketmonI = new HashMap<>(N); // HashMap은 저장공간보다 값이 추가로 들어오면 약 두배로 늘립니다. 과부하 발생할 수 있기에 초기 저장공간 설정해주는게좋음
        HashMap<String,Integer> pocketmonS = new HashMap<>(N); // HashMap은 저장공간보다 값이 추가로 들어오면 약 두배로 늘립니다. 과부하 발생할 수 있기에 초기 저장공간 설정해주는게좋음

        for (int i=1;i<=N; i++){
            String pock = br.readLine();
            pocketmonI.put(i,pock);
            pocketmonS.put(pock,i);
        }
        StringBuilder sb = new StringBuilder();
        while(M-->0){
            String s = br.readLine();
            if(Character.isDigit(s.charAt(0))){//숫자이면
                sb.append(pocketmonI.get(Integer.parseInt(s))).append('\n');
            }
            else sb.append(pocketmonS.get(s)).append('\n');
        }
        System.out.println(sb);
    }
}
