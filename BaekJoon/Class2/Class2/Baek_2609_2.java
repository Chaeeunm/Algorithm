package BaekJoon.Class2.Class2;

import java.io.IOException;
import java.util.Scanner;

public class Baek_2609_2 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int max = 유클리드호제(a,b);
    int min = a * b / max;

    System.out.println(max);
    System.out.println(min);

  }

  public static int 유클리드호제(int a, int b) {
    if(a%b ==0){
      return b; //이때 b가 최대공약수
    }
    return 유클리드호제(b, a%b);
  }
}
