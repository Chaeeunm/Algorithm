package BaekJoon.Class2.Baek_2609;//2609 최대공약수와 최소공배수
import java.util.*;

public class Baek_2609_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int GCD = gcd(num1, num2);//최대공약수
        int LCM = num1 * num2 / GCD; //최소공배수

        System.out.println(GCD);
        System.out.println(LCM);
    }

    public static int gcd(int num1, int num2){
        if (num1 % num2 == 0) return num2; // num1을 num2로 나눴을 때 나머지가 0이면 자연스레 최대공약수는 num2가 됨
        return gcd(num2, num1 % num2); //num2로 바꾸고 num2를 R로 바꾼다.
    }
}
/* GCD 예시
    (ex) a = 12, b= 8
            GCD(최대공약수) = 4
            gcd(12, 8) > gcd(8, 4) >> GCD = 4
*/

/* 유클리드 호제법
    A = B * Q + R  (A는 B에 어떤 수를 곱한 값 + 나머지로 나타낼 수 있다.)

    R= A를 B로 나눈 나머지
    G= A와 B의 최대공약수
    G를 A와 B의 최대공약수라 할때

    a*G = b*G*Q + R (A와 B는 최대공약수 G로 나눠서 이렇게 표현할 수 있다.)
    R = G(a-b*Q) (R에 대한 식으로 이항해서 정리해보면)
    따라서 유클리드 호제법에 의하면 A를 B로 나눈 나머지 R도 A와 B의 최대공약수 G를 가지게 된다.
    (재귀함수로 B와 R을 넘겨가면서 진행)
 */