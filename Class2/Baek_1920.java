package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baek_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] count = new boolean[100001];

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            count[Integer.parseInt(st.nextToken())] = true;
        }


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            String s= (count[num])?"1":"0";
            sb.append(s).append('\n');
        }
        System.out.println(sb);



//        int N = Integer.parseInt(br.readLine());
//        String[] numN = Arrays.stream(br.readLine().split(" ")).distinct().sorted().toArray((String[]::new)); //스트링 타입으로 한번에 저장
//        int M = Integer.parseInt(br.readLine());
//
//        String[] numM = br.readLine().split(" "); //입력받은 값 배열로 저장
//        for (int i=0; i<numN.length; i++){
//            int result = Arrays.binarySearch(numM,numN[i]);
//            if (result >= 0) {
//                sb.append(1).append('\n'); //1 출력
//            } else sb.append(0).append('\n'); //그렇지 않으면 0출력
//        }
//        System.out.println(sb);
    }
}
