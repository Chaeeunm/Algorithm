package BaekJoon.Class1;
//2439 별찍기
import java.util.*;

public class Baek_2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        for(int i =1 ; i <= N; i++) { //N번 반복
            for (int j=0; j < N-i; j++) { //i번째 줄에 공백을 N-i번 만큼 추가
                sb.append(" ");
            }
            for(int k = 0; k< i; k++){ //i번째 줄에 *을 i번 만큼 추가
                sb.append("*");
            }
            sb.append('\n'); //한 줄이 끝나면 줄바꿈
        }
        System.out.println(sb);
    }
}