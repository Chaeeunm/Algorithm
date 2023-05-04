
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[6];

    static long m2 = Long.MAX_VALUE;
    static long m3 = Long.MAX_VALUE;
    static long m1 = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        //A=0 B=1 C=2 D=3 E=4 F=5
        //CD,AF,EB는 안됨
        for (int j = 0; j < 5; j++) {
            for (int k = j + 1; k < 6; k++) {
                if ((j == 0 && k == 5) || (j == 1 && k == 4) || (j == 2 && k == 3)) {
                    continue;
                }
                m2 = Math.min(m2, arr[j] + arr[k]);
            }
        }
        //마주보는 면끼리는 같이 할 수 없음을 이용
        //마주보는 면에 있는 수 중 더 작은수를 더함
        //EB //DC //AF 끼리 마주보고 있음
        m3 = Math.min(arr[0], arr[5]) + Math.min(arr[1], arr[4]) + Math.min(arr[2], arr[3]);
        for (int j = 0; j < 6; j++) {
            m1 = Math.min(m1, arr[j]);
        }
        Arrays.sort(arr); //오름차순 정렬
        System.out.println(dice(N));

    }
//1개 면 보일때 ->1 //2개 면 보일떄 -> 3 //3개 면 보일떄 ->6
//3개 면 보이는 주사위: 무조건 4개
// 2개 면 보이는 주사위 (n-1)*4+(n-2)*4 = 4(2n-3) = 8n-12개
// 1개 면 보이는 주사위: 4(n-2)(n-1)+(n-2)^2 = 5n^2 - 16n + 12
    static long dice(long N) {
        long result3 = 4 * m3;
        long result2 = (8 * N - 12) * m2;
        long result1 = (5 * N * N - 16 * N + 12) * m1;
        long result = N==1?arr[0]+arr[1]+arr[2]+arr[3]+arr[4]:result1+ result2 + result3;
        return result;
    }

}