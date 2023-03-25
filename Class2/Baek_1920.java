package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

//이진탐색 사용 -> 시간초과 해결
public class Baek_1920 { //testtest
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");

        int N = Integer.parseInt(br.readLine());
        String[] numN = Arrays.stream(br.readLine().split(" ")).distinct().sorted().toArray((String[]::new)); //스트링 타입으로 한번에 저장
        int M = Integer.parseInt(br.readLine());

        String[] numM = br.readLine().split(" "); //입력받은 값 배열로 저장
        for (int i=0; i<numN.length; i++){
            int result = Arrays.binarySearch(numM,numN[i]);
            if (result >= 0) {
                sb.append(1).append('\n'); //1 출력
            } else sb.append(0).append('\n'); //그렇지 않으면 0출력
        }
        System.out.println(sb);
    }
}
