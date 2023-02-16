package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항 계수 1
public class Baek_11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BC(N, K));
    }
        static int BC ( int N, int K){
            // 2번 성질
            if (N == K || K == 0) {
                return 1;
            }
            // 1번 성질
            return BC(N - 1, K - 1) + BC(N - 1, K);
        }
//자연수
//N과 정수
//K가 주어졌을 때 이항 계수
//binom{N}{K}를 구하는 프로그램을 작성하시오.
//주어진 크기 집합에서 원하는 개수만큼 순서없이 뽑는 조합의 가짓수
}
