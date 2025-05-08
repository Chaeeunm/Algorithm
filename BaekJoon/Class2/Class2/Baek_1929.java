package BaekJoon.Class2.Class2;

import java.util.Scanner;

public class Baek_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = s; i<=e; i++){

            if(i ==1) continue;

            for(int j=2; j<=Math.sqrt(i); j++) {

                if(i%j ==0) continue;

                else if(j == Math.sqrt(i)) sb.append(i).append('\n');

            }
            }
        System.out.println(sb);
        }

    }

