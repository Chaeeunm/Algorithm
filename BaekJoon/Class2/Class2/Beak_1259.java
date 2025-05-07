package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while (true) {
            String s= br.readLine();
            if(s.equals("0")) break;
            if(s.length() == 1) {
                sb.append("yes").append('\n');
                continue;
            }
            for(int i=0; i<s.length()/2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - (1+i))){
                    sb.append("no").append('\n');
                    break;
                }
                if(i == s.length()/2 -1){
                    sb.append("yes").append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
