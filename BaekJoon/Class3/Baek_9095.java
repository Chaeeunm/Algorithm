package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_9095 {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (tc-->0){
            int i = Integer.parseInt(br.readLine());
            count=0;
            sb.append(count(i)).append('\n');
        }
        System.out.println(sb);
    }
    static int count(int i){
        if(i==0) count++;
        if(i>0) count(i-1);
        if(i>1) count(i-2);
        if(i>2) count(i-3);
        return count;
    }
}
