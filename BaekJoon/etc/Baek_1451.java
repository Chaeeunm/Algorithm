package BaekJoon.etc;

import java.util.Scanner;

public class Baek_1451 {

  static long[][] dp;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long p = sc.nextLong();
    long q = sc.nextLong();

    dp = new long[10000][10000];

  }
  //0 ≤ N ≤ 1012
  // 2 ≤ P, Q ≤ 109


  //A0 = 1
  // Ai = A⌊i/P⌋ + A⌊i/Q⌋ (i ≥ 1)
  //입력 : N P Q

}

