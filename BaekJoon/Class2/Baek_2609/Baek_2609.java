package BaekJoon.Class2.Baek_2609;

import java.util.Scanner;

//최대공약수와 최소공배수
public class Baek_2609 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int commonDivisor = 1; //최초 최대공약수 1로설정
        //두 수중 작은 수에서부터 돌면서 공약수를 확인
        for (int i = Math.min(num1, num2); i > 1; i--) {
            /*만약 i가 num1과 num2의 공약수이면*/
            if (num1 % i == 0 && num2 % i == 0) {
                commonDivisor *= i; // 최대공약수 변수에 i값 곱해줌
                num1 /= i;
                num2 /= i; //num1과 num2값은 i로 나눠진 상태에서 다시 for문을 돌 것
            }
        }
        int commonMultiple = commonDivisor*num1*num2; //최소공배수 = 최대공약수 * 나눠진수1*나눠진수2
        System.out.println(commonDivisor+ "\n" + commonMultiple);
    }
}