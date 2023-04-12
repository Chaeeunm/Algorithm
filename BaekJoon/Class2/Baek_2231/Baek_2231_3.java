package BaekJoon.Class2.Baek_2231;

import java.util.Scanner;

public class Baek_2231_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result =0;
//가장 작은 생성자
        for(int i=1; i<N;i++){
            int sum=0; //sum 0으로 초기화
            int lenI =Integer.toString(i).length();
            for(int j=0; j<lenI; j++){ //j가 0이 아니라면
                sum += Integer.toString(N).charAt(j); //sum에 N의 첫번째 자리숫자부터 더해줌
            }
            if(sum+i==N){
                result =i;
                break;
            }
        }
        System.out.println(result);
    }
}
