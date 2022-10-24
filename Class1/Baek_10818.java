package Class1;
//10818 최소,최대

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Baek_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //2 공백단위로 읽으려면 Tokenizer에 넣어서 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000000;
        int min = 1000000;


        for (int i = 1; i <= N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input > max) max = input;
            if (input < min) min = input;
        }
        bw.write(min + " " + max);//출력
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();//스트림을 닫음
    }
}
