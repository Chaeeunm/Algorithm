package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2477 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] chamWhy = new int[6][2];


    for(int i =0; i<6; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      chamWhy[i][0] = Integer.parseInt(st.nextToken());
      chamWhy[i][1] = Integer.parseInt(st.nextToken());
    }
    int maxG =0;
    int maxS = 0;
    int minG = 500; //maxS 옆에 있는 애중 더 작은 값
    int minS = 500; //maxG 옆에 있는 애중 더 작은 값

    for(int i =0; i<6; i++) {
      if(chamWhy[i][0] ==1|| chamWhy[i][0]==2) {
        if(maxG < chamWhy[i][1]){
          maxG = chamWhy[i][1];
          if(i == 0){
            minS = Math.min(chamWhy[5][1],chamWhy[1][1]);
          }
          else if(i == 5) {
            minS = Math.min(chamWhy[4][1],chamWhy[0][1]);
          }
          else {
            minS = Math.min(chamWhy[i-1][1],chamWhy[i+1][1]);
          }
        }
      }
      else if(maxS < chamWhy[i][1]){
        maxS = chamWhy[i][1];
        if(i == 0){
          minG = Math.min(chamWhy[5][1],chamWhy[1][1]);
        }
        else if(i == 5) {
          minG = Math.min(chamWhy[4][1],chamWhy[0][1]);
        }
        else {
          minG = Math.min(chamWhy[i-1][1],chamWhy[i+1][1]);
        }
      }
    }

    int result = (maxG * maxS - ((maxG - minG) *(maxS - minS))) *n;

    System.out.println(result);

  }
}
