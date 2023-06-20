package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2230 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int start = 0;
        int end = 0;
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = arr[0];

        //start부터 end까지의 합이 M보다 작으면 end++
        //크면 start++
        //같으면 cnt++ 후 start++ end++
        //end<=N일때까지 반복

        while (end < N) { //4 2 1111   cnt start end sum
            if (sum == M) {//
                cnt++;
                if(end<N-1) {
                    sum -= arr[start++]; //start값을 빼준 후 start 1 smffuwna
                    sum += arr[++end]; //end 값을 더해준 후 arr[end] 값을 더해줌
                }
            } else if (sum < M) { //0 0 1 2
                sum += arr[++end];
            } else if (sum > M) {
                sum -= arr[start++];
            }
        }
        System.out.println(cnt);
    }

}
