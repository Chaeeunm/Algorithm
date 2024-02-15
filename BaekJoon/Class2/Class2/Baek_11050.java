package BaekJoon.Class2.Class2;

import java.util.Scanner;
//nCk = n!/(n-k)!k! ex) 5C3 = 5!/2!3! =120/12 =10
// nPk = nCk *k! = n!/(n-k)!

public class Baek_11050 {
    public static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        arr = new int[n+1][k+1];
        int result = BC(n,k);
        System.out.println(result);

    }
    //nCr = n-1Cr-1 + n-1Cr
    //nCn = nC0 = 1
    public static int BC(int n, int k) {
        //이미 풀었으면 계산 않고 값 리턴
        if(arr[n][k] >0 )return arr[n][k];
        if(k==0 | n==k) return arr[n][k] = 1;
        return arr[n][k] = BC(n-1,k-1) + BC(n-1,k);
    }
}
