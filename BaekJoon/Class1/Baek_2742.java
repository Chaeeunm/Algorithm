package BaekJoon.Class1;

import java.util.Scanner;

public class Baek_2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = N; i > 0; i--) {
            sb.append(i);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}

