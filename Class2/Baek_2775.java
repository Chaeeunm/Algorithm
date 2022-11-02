package Class2;
//2775 부녀회장이 될테야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2775 {
        //a층의 b호에 사려면 자신의 아래(a-1)층의 1호부터 b 호까지 사람들의 수의 합만큼
        //사람들을데려와 살아야 한다
        //tc k층 n 호에는 몇명이 살고 있는가
        //0층의 i 호에는 i명이 산다
        //2층 1 4 10 16 31 ... arr[n] = 1, 1+1+2 , 1+1+2+1+2+3 ... 1 + 1+2+ ...+1+2+3+..n
        //1층 1 3 6 10 15 ...arr[n] = 1부터 ㄲㅏ지의 합
        // 0층 1 2 3 4 5 6 ...i

            public static int[][] APT = new int[15][15]; //아파트 2차원 배열 생성

            public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                make_APT();

                int T = Integer.parseInt(br.readLine());

                for (int i = 0; i < T; i++) {
                    int k = Integer.parseInt(br.readLine());
                    int n = Integer.parseInt(br.readLine());
                    sb.append(APT[k][n]).append('\n');
                }
                System.out.println(sb);
            }

            public static void make_APT() { //아파트를 만드는메서드

                for (int i = 0; i < 15; i++) {
                    APT[i][1] = 1; // i층 1호
                    APT[0][i] = i; // 0층 i호
                }

                for (int i = 1; i < 15; i++) { // 1층부터 14층까지

                    for (int j = 2; j < 15; j++) { // 2호부터 14호까지 채워줌
                        APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
                    }
                }
            }

        }


