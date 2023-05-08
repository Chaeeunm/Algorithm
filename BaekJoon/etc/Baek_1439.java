package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        System.out.println(count(S));

    }
    static int count(String S){
        //젤 앞 문자와 같은 문자쌍을 세줌
        char f = S.charAt(0); //첫 문자
        char l = S.charAt(S.length()-1); //마지막 문자
        int count =1;
        //i는 1부터 비교 //0번 인덱스 문자와 같고, 이전 인덱스와 다르면 count++
        for(int i=1; i<S.length(); i++){
            char b = S.charAt(i); //비교해줄 인덱스 문자
            if(b==f&&b!=S.charAt(i-1)){
                count++;
            }
        }
        return (f==l)? count-1:count;
    }
}
