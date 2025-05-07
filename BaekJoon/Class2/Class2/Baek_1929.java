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
////
//public class Baek_1929 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int s = sc.nextInt();
//        int e = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = s; i <= e; i++) {
//            if (i == 1)
//                continue;
//
//            boolean isPrime = true;
//
<<<<<<< HEAD
//            //소수인지 아닌지 체크
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) { //즉 소수가 아니야
=======
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
>>>>>>> 29c23dfaf9301c003b3121c3e6971452fd43af12
//                    isPrime = false;
//                    break;
//                }
//            }
//
<<<<<<< HEAD
//            if (isPrime) { //소수야
=======
//            if (isPrime) {
>>>>>>> 29c23dfaf9301c003b3121c3e6971452fd43af12
//                sb.append(i).append('\n');
//            }
//        }
//
//        System.out.println(sb);
//    }
<<<<<<< HEAD
=======
//
>>>>>>> 29c23dfaf9301c003b3121c3e6971452fd43af12
