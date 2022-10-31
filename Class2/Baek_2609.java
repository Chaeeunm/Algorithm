package Class2;

import java.util.Scanner;

//최대공약수와 최소공배수
public class Baek_2609 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int commonDivisor = 1; //최초 최대공약수 1로설정
        /*Math.min()-> 두 인자 중 작은 값을 리턴하는 함수
        두 수중 작은 수까지 돌면서 공약수를 확인
         */
        for (int i = Math.min(num1, num2); i > 1; i--) {
            /*만약 i가 num1과 num2의 공약수이면*/
            if (num1 % i == 0 && num2 % i == 0) {
                commonDivisor *= i; // 최대공약수 변수에 i값 곱해줌
                num1 /= i;
                num2 /= i; //num1과 num2값은 i로 나눠진 상태에서 다시 for문을 돌 것
                i = Math.min(num1, num2); //i는 다시 두 수중 작은 수로 초기화하여 for문을 돌 것
            }
        }
        int commonMultiple = commonDivisor*num1*num2; //최소공배수 = 최대공약수 * 나눠진수1*나눠진수2
        System.out.println(commonDivisor+ "\n" + commonMultiple);
    }
}
/*메모 처음에는 i값을 2에서 ++해주면서 약수를 구해 주었는데 이때의 경우 두 수가 같을 때 문제가 발생하는 것을 확인하였고,
 나눌 수 있는 가장 큰 수에서 작은수로 내려가며 구하니 해결되었다. 이 방법이 시간적으로 효율적이다.
 근데 내가 알고있던 공약수,공배수 구하는 공식이 틀렸던건가? 그대로 풀면 2에서 더해가며 구해도 값이 맞게 나와야 한다. 왜일까?
 */