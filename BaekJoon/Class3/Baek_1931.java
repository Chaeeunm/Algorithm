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

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            //시작시간 , 끝시간
            int sTime = Integer.parseInt(st.nextToken());
            int eTime = Integer.parseInt(st.nextToken());

            h[i][0] = sTime;
            h[i][1] = eTime;
        }
        Arrays.sort(h, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //시작시간이 같을 경우 종료시간이 빠른 순으로 정렬
                if(o1[0] ==o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        //시작 순으로 나열
        int cnt =0; //사용할 수 있는 최대 회의의 개수
        int time = h[0][1];
        for(int i=1; i<N; i++){
            //두 회의가 겹치면 끝시간이 빠른걸 선택

        }


        //겹치지 않는 것중 끝시간이 더 빠른거 찾음
    }
}
