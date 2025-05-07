package BaekJoon.Class2.Baek_2231;

import java.util.Scanner;

public class Baek_2231_re {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int result = 0;

    for(int i = 1; i<N; i++) {
      int num = i;
      int sum = 0;
      while (num > 0){
        sum += num % 10; //일의자리 수 더하기
        num /= 10; //일의자리 수 제거
      }
      if(sum + i == N){
        result = i;
        break;
      }
    }
System.out.println(result);
  }
}
