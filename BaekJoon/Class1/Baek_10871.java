package BaekJoon.Class1;

import java.io.*;
import java.util.*;

public class Baek_10871 {
    //N X
    //수열 A(N개)
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //공백단위로 읽으려면 TOkenizer에 넣어서 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        String arr[] = s.split(" ");

        for(String str :arr){
            if(Integer.valueOf(str)<X){
                System.out.print(str + " ");
            }
        }
    }
}
