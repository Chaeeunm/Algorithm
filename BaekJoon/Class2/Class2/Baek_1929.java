package BaekJoon.Class2.Class2;

import java.util.Scanner;

public class Baek_1929 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    int e = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    for(int i = s; i<=e; i++){ //s =2 / e = 8

      if(i ==1) continue; //1은 소수가 아니니까 다음으로 넘어감

      boolean isPrime  = true;
      // i 가 소수인지 아닌지를 판별하는 반복문
      //i = 16

      //             j<=4.32423
      for(int j=2; j<= Math.sqrt(i); j++) { //소슈 -> 1과 자기자신을 제외한 수로 나누어 떨어지지 않는 수

        //해당 숫자가 j로 나눠지면 -> 소수가 아님 -> 반복문 탈출
        //16 % 2 == 0
        if(i%j ==0) break;

        //마지막 숫자에 다다를 때까지 j로 나눠지지 않으면 -> 소수면 -> sb에 입력
        else if( Math.sqrt(i) -1 <= j && j <= Math.sqrt(i)) sb.append(i).append('\n');

      }
    }
    System.out.println(sb);//논리가 틀렸나바 ㅠ_ㅠ 그래도 머가 문젠지 찾았다
  }

}
//
// public class Baek_1929 {
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
//            //소수인지 아닌지 체크
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) { //즉 소수가 아니야
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) { //소수야
//                sb.append(i).append('\n');
//            }
//        }
//
//        System.out.println(sb);
//    }
