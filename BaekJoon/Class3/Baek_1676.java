package BaekJoon.Class3;

import java.util.Scanner;

public class Baek_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countZero(fac(N)));
    }
    static int fac(int N ){
        if(N==0) return 0;
        else if(N==1) return 1;
        else return N * fac(N-1);
    }
    static int countZero(int N){
        String s = String.valueOf(N);
        int count =0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0') count ++;
            else break; //0이 아닌 수가 나오면 반복문 종료
        }
        return count;
    }
}
