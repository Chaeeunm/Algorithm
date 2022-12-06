package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         *  HashMap<Key, Value>
         *  Key = 입력되는 원소
         *  Value = 원소의 개수(=중복 입력 된 원소의 수)
         */
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());

            /*
             * getOrDefault(key, defaultValue)
             * key에 대해 map에 저장 된 value를 반환한다.
             * 만약 value가 없을 경우 defaultValue값을 반환한다.
             */
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
        /*숫자 카드는 정수 하나가 적혀져 있는 카드이다.
        상근이는 숫자 카드 N개를 가지고 있다.
        정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.*/

