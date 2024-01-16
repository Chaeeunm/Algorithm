//분해합_2번째 방법

import java.util.Scanner;
//분해합 2번째 방법
public class Main {
    //N-N의 자릿수*9보다 작은 수는 생성자가 될 수 없다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        int result = 0;
        int length = N.length();
        int intN = Integer.parseInt(N);

        for(int i = intN - (length*9); i<intN; i++){
           int j = i;
           int sum =0;
           while(j !=0){
               sum += j%10; //1의자리수를 더해줌
               j /= 10; //1의자리수를 없애줌
           }
           if(sum+i==intN){
               result = i;
               break;
           }
        }
        System.out.println(result);
    }
}