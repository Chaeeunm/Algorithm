package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder("");

        int N = Integer.parseInt(br.readLine());
        String[] numN = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] numM = br.readLine().split(" ");

        br.close();

        /*숫자 카드는 정수 하나가 적혀져 있는 카드이다.
        상근이는 숫자 카드 N개를 가지고 있다.
        정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.*/

    }
}
