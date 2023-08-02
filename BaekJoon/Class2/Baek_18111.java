package BaekJoon.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int max = 0;

        int[] heights = new int[257];
        for(int i=0; i< S; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<G; j++){
                int tmp = Integer.parseInt(st.nextToken());
                heights[tmp]++; //h번째 높이에 더해줌
                min = Math.min(min,tmp); //현재 높이와 최소 높이중 더 작은것에 min저장
                max = Math.max(max,tmp); //최대높이 저장
            }
        }

        int ans = Integer.MAX_VALUE;
        int height = 0;
        for(int i =0; i<=max; i++){
            int currB = B;
            int currAns = 0; //현재 높이로 만들기 위해 필요한 총 시간
            for(int j=min; j<= max; j++){
                if(j>i){ //높이가 ㅑ보다 큰 경우 => 현재 높이보다 블록이 많은 경우 블록을 제거해야 함
                    currAns += heights[j] * ((j-i) * 2);
                    currB += heights[j] * (j -i);
                } else { //현재 높이보다 블록이 적은 경우는 블록을 추가해야 함
                    currAns += heights[j] * (i - j);
                    currB -= heights[j] * (i-j);
                }
            }

            if(currB < 0) continue;;
            //인벤토리에 충분한 블록이 있다면 ans와 heights 갱신
            if(ans >= currAns){
                ans = currAns;
                height = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans).append(" ").append(height);
        System.out.println(sb);

        //int[][] map = new int[S][G];

//
//        int time = Integer.MAX_VALUE;
//
//        int min = 256;
//        int max = 0;
//        int height = 0;
//
//        for(int i=0; i< S; i++){
//            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        }
//        //돌면서 가장 큰 수 와 작은수 저장
//        for(int i=0; i<S; i++){
//            for(int j=0; j<G; j++){
//                int tmp =map[i][j];
//                if(tmp<min) min = tmp;
//                if(tmp>max) max = tmp;
//            }
//        }
//        //만약 블록수 + 다 빼는 블록 >= 다더하는 블록
//        int maxR =0;
//        int minR =0;
//        for(int i=0; i<S; i++) {
//            for (int j = 0; j < G; j++) {
//                int tmp = map[i][j];
////                maxR += max - tmp;
////                minR += tmp - min;
//                maxR += Math.max(0, max - tmp); // 현재 높이가 max보다 작으면 블록을 추가합니다.
//                minR += Math.max(0, tmp - min); // 현재 높이가 min보다 크면 블록을 제거합니다.
//            }
//        }
//        if(maxR <= B) {
//            time = maxR;
//            height = max;
//        }
//        if(minR *2 <time){
//            time = minR*2;
//            height = min;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(time+ " " + height);
//        System.out.println(sb);

        //max 와의 차이 계산 합이 B보다 작다면 time에 저장, height에 max저장
        //그렇지 않다면
        //min 와의 차이 계산 =  a time 보다 a*2가 작다면 time 에 a*2 저장/ height에 min저장

        //time 출력
        //height 출력
    }
}
