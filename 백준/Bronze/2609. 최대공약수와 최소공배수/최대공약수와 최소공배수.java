import java.util.*;

public class Main {
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