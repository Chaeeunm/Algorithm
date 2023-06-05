package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_5525 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String S = br.readLine();

        int count = 0;
        int check = 0;
        int m = 0;

        while (m < (M - 2)) {
            if (S.charAt(m) == 'I' && S.charAt(m + 1) == 'O' && S.charAt(m + 2) == 'I') {
                check++;
                m += 2;
            } else {
                check = 0;
                m++;
            }
            if (check == N) {
                count++;
                check--;
            }

        }
        System.out.println(count);
    }
}


