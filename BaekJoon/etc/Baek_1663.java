package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//XYZ 문자열
public class Baek_1663 {
    static StringBuilder[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num= Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        dp = new StringBuilder[N+1];
        dp[1] = new StringBuilder("X");
        dp[2] = new StringBuilder("YZ");
        dp[3] = new StringBuilder("ZX");
        StringBuilder nxyz = xyz(N);

        switch (num){
            case 1:
                System.out.println(nxyz.length());
                break;
            case 2:
                int k = Integer.parseInt(br.readLine());
                System.out.println(nxyz.charAt(k-1));
            break;
            case 3:
                char c = br.readLine().charAt(0);
                System.out.println(count(c,nxyz.toString()));
                break;
        }

    }
    static StringBuilder xyz(int N){
        if(dp[N]!=null) return dp[N];
        return dp[N] = xyz(N-3).append(xyz(N-2)) ;
    }
    static int count(char c, String nxyz){
        int count =0;
        for(int i=0; i<nxyz.length(); i++){
            if(c == nxyz.charAt(i)) count++;
        }
        return count;
    }
    //dp함수 -> 반환값 string
    //1.문자열 길이
    //2.문자열에서 k번째 문자 구하기(3째줄에)
    //3.문자열에서 특정 문자 몇번 나타나는지 구하기
}
