package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//ABCDE 만약 자리수만큼돌며
public class Baek_1339 {
    static Integer[] alp = new Integer[26]; //A-65~ Z90
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Arrays.fill(alp,0);
        //N만큼 돌며 calcul 원소 하나씩 넣어줌
        for(int i =0; i<N; i++){
            calcul(br.readLine());
        }
        //alp배열 내림차순 sort
        Arrays.sort(alp,Collections.reverseOrder());
        //9~1까지 alp배열의 0번 원소부터 곱하면서 더해줌
        int sum=0;
        int mul=9;
        for(int i=0;i<10;i++){
            if(alp[i]!=null) {
                sum += alp[i] * mul;
                mul--;
            }
            else break;
        }
        System.out.println(sum);
    }

    static void calcul(String word){ //큰 수대로 정렬 // 9 곱함 //8곱함
        for(int i=0; i<word.length(); i++){ //4 ABCD A *10*10*10
            int asc = (int)word.charAt(i) - 65; //word.charAt - 'A'
            int num =1;
            for(int j=i; j<word.length()-1; j++){
                num *=10;
            }
            alp[asc] += num;
        }
        //i=0 부터 원소길이-1 까지 돌며
        //int asc = charAt(i) 를 int로 바꾼 후 -65
        //int num = 1
        //1 * 10*10(2번) + 1*10(1번) + 1 * 1(0번i번) 1 *= 10 을 원소길이-(i+1)번 만큼 반복
        //alp[asc] += num; 더해서 저장
    }
}
