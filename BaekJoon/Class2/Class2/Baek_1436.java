package BaekJoon.Class2.Class2;

import java.util.Scanner;

// public class Baek_1436 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     int n = sc.nextInt();
//
//     int result = calculator(n);
//
//     System.out.println(result);
//   }
//
//
//   public static int calculator(int n){
//     int seasonNum = 0;
//     int result =0;
//     for(int i = 666; i<10000666; i++){
//
//       String s = String.valueOf(i);
//       int cnt6 = 0; //연속하는 6갯수 담아줄 변수
//
//       //1부터 s길이까지 돌면서
//       for(int j =1; j < s.length(); j++) {
//
//         //j번째 인덱스와 그 이전 인덱스가 6이면
//         if(s.charAt(j-1) == '6' && s.charAt(j) == '6'){
//           cnt6++; //6카운트 하나 올려줌
//
//           if(cnt6 == 2){ //cnt가 2가 되면 == 연속하는 수가 3개가 되면
//             seasonNum ++; //영화 시즌을 하나 올려주며 다음 for문 반복
//             // System.out.println("season = " + seasonNum + ", i = " + i );
//             break;
//           }
//         }
//       }
//       if(seasonNum == n ){ //n번째 영화가 시즌 넘버와 일치한다면
//         result = i; //result에 i 담아주며 for문 탈출
//         break;
//       }
//     }
//     return result;
//   }
// }
public class Baek_1436 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = calculator(n);

    System.out.println(result);
  }

  public static int calculator(int n) {
    int seasonNum = 0;
    int result = 0;

    for (int i = 666; ; i++) {
      String s = String.valueOf(i);

      if (s.contains("666")) {
        seasonNum++;
      }

      if (seasonNum == n) {
        result = i;
        break;
      }
    }

    return result;
  }
}