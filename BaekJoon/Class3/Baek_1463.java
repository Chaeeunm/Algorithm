package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두가지의 경우로 DFS 해줌
//3으로 나누고 +1 나머지를 더해줌 나눈 수 리턴
//2로나누고 +1 나머지를 더해줌 나눈 수 리턴
//탈출 조건 = 1일떄
public class Baek_1463 {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        System.out.println(countMin(i,0));
    }
    public static int countMin(int i,int count) {
        if(i<2) return count;
         return Math.min(countMin(i/2,count+1+(i%2)),countMin(i/3,count+1+(i%3)));
        }
    }
