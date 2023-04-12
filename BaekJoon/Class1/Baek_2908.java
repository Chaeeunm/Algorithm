package BaekJoon.Class1;

import java.io.*;
import java.util.StringTokenizer;

//2908 상수
public class Baek_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuffer num1 = new StringBuffer(st.nextToken().toString());
        int revNum1 = Integer.valueOf(num1.reverse().toString());

        StringBuffer num2 = new StringBuffer(st.nextToken().toString());
        int revNum2 = Integer.valueOf(num2.reverse().toString());
        /*삼항연산자 사용*/
        int a = (revNum1>revNum2) ? revNum1 : revNum2 ;

        /*br는 정수출력이 안되므로 문자열로 변환하여 출력*/
        bw.write( Integer.toString(a) );//출력
        br.close();
        bw.flush();
        bw.close();
    }

}