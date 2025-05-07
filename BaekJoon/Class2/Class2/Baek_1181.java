package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//길이가 짧은 것부터
//길이가 같으면 사전순으로
//중복된 단어는 하나만 남기고 제거
public class Baek_1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i =0; i<n; i++) {
            arr[i] = br.readLine();
        }

       Arrays.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String s1, String s2) {
               //양수 -> 자리 바꿈
               //0,음수 -> 자리 바꾸지 않음

               // S1-S2 -> 오름차순
               //S2 - S1 -> 내림차순

               if(s1.length() == s2.length())  {
                   return s1.compareTo(s2);
               }
               //그렇지 않으면 길이 오름차순대로
               return s1.length() - s2.length();
           }
       });
        StringBuilder sb = new StringBuilder();


        Arrays.stream(arr).distinct().forEach(a -> sb.append(a).append('\n'));

        System.out.println(sb);
    }
}
