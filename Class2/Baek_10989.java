package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*Counting sort두 수를 비교하는 과정이 없기 때문에 빠른 배치가 가능하다. 다만
counting 배열이라는 새로운 배열을 선언해주어야 하기 때문에. array 안에 있는 max값의 범위에 따라 counting 배열의 길이가 달라지게 된다
수열의 길이보다 수의 범위가 극단적으로 큰 경우 counting sort의 방법은 메모리 낭비가 크다
이 문제의 경우 counting sort로 풀면 시간복잡도는 O(N + K) 이다. (K= 자릿수), 데이터가 많을 수록 O(N) 에 가까워짐*/
public class Baek_10989 {
     public static void main(String[] args) throws IOException {

         // 수의 범위 만큼의 길이를 가진 배열 선언
         int[] count = new int[10001];

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int N = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine());

         for (int i = 0; i < N; i++) {
             // 해당 인덱스의 값을 1 증가
             count[Integer.parseInt(br.readLine())]++;
         }

         br.close();

         StringBuilder sb = new StringBuilder();
         // 0은 입력범위에 없으므로 1부터 시작
         for (int i = 1; i < 10001; i++) {
             // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
             while (count[i] > 0) {
                 sb.append(i).append('\n');
                 count[i]--;
             }
         }
         System.out.println(sb);
     }
 }
