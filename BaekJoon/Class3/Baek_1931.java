package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] h = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            //시작시간 , 끝시간
            int sTime = Integer.parseInt(st.nextToken());
            int eTime = Integer.parseInt(st.nextToken());

            h[i][0] = sTime;
            h[i][1] = eTime;
        }
        Arrays.sort(h, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //시작시간순으로 정렬
                return o1[0] - o2[0];
            }
        });
        int cnt = 1; //사용할 수 있는 최대 회의의 개수
        int time = h[0][1]; //마지막 시간
        for (int i = 1; i < N; i++) {
            //두 회의가 겹치면 끝시간이 빠른걸 선택
            //다음 회의의 시작시간이 time보다 작다면(같으면 가능)
            //time변수에 더 빠른 끝시간을 넣음
            if (h[i][0] < time) {
                time = Math.min(time, h[i][1]);
            } else {
                cnt++;//겹치지 않으면 count하나 올려주고 time 변수에 끝시간을 넣음
                time = h[i][1];
            }
        }
        System.out.println(cnt);
    }
}
