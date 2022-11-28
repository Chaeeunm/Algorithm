package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine(); //스트링 타입으로 한번에 저장
        int M = Integer.parseInt(br.readLine());

        String[] ArraysStr = br.readLine().split(" "); //입력받은 값 배열로 저장
        for (int i = 0; i < ArraysStr.length; i++) {
            if (str.contains(ArraysStr[i])) { //ArrayStr배열의 i번째 값이 str에 포함되어 있다면
                sb.append(1).append('\n'); //1 출력
            } else sb.append(0).append('\n'); //그렇지 않으면 0출력
        }
        System.out.println(sb);
    }
}
