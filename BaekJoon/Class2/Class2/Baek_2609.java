package BaekJoon.Class2.Class2;

import java.util.Scanner;

public class Baek_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //최대공약수
        //최소공배수
        int a = cal(N, M);
        System.out.println(a);
        System.out.println((M * N) / a);
    }
    static public int cal(int N, int M){
        if(N%M==0) return M; //이때 M이 최대공약수
        else return cal(M,N%M);
    }
}
