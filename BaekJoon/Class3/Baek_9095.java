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
        if(i>0) count(i-1); //nlogn -> 이분탐색
        if(i>1) count(i-2);
        if(i>2) count(i-3);
        return count;
    }
}

//import java.io.*;
//
//public class Main{
//    public static void main(String[] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//
//        int dp[] = new int[11];
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//
//        for(int i = 4; i < 11; i++)
//            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//        for(int i = 0; i < tc; i++){
//            int t = Integer.parseInt(br.readLine());
//            sb.append(dp[t] + "\n");
//        }
//        System.out.println(sb);
//    }
//}
