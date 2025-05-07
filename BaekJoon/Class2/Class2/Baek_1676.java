package BaekJoon.Class2.Class2;

import java.math.BigInteger;
import java.util.Scanner;

public class Baek_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger result = new BigInteger("1");
        while (n-->0) {//10 9 8 7 6 5 4 3 2 1
            result = result.multiply(BigInteger.valueOf(n+1));
        }

        String s = result.toString();
        int cnt =0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                cnt++;
            }
            else break;
        }
        System.out.println(cnt);
    }
}
