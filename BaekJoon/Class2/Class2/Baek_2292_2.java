package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2292_2 {
    //1 1개
    //1 + 6 2개
    //1 + 6 + 12 3개
    //1 + 6 + 12 + 18 4개
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) - 1; //3
        int cnt = 1;
        if (N == 0) System.out.println(cnt);
        else {
            while (N > 0) {
                N -= 6 * cnt;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
