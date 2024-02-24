import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
  static int[] BW = new int[]{1,0,1,0,1,0,1,0};
  static int[] WB = new int[]{0,1,0,1,0,1,0,1};
  public static void main(String[] args) throws IOException {

    //B =1 , W = 0

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int s = Integer.parseInt(st.nextToken()); //세로
    int g = Integer.parseInt(st.nextToken()); //가로

    int[][] board = new int[s][g];

    for(int i =0; i<s; i++) {
      String tmp = br.readLine();
      for(int j=0; j< g; j++) {
        if(tmp.charAt(j) == 'B') board[i][j] = 1;
        else board[i][j] = 0;
      }
    }

    int[][] chess = new int[8][8];
    int result = Integer.MAX_VALUE;

    StringBuilder sb = new StringBuilder();

      for(int j=0; j<g -7; j++) {
        for(int i =0; i<s -7; i++) {
          for(int k =0; k<8; k++) {
            chess[k] = Arrays.copyOfRange(board[i+k], j, j + 8);
            for(int a =0; a<8; a++) {
            }
          }

          //BW로 시작하는 보드랑 WB로 시작하는 보드 중 더 조금 칠해도 되는 보드의 cnt 수
          int compareCnt = Math.min(compareBWStart(chess), compareWBStart(chess));

          result = Math.min(result, compareCnt);
      }
    }

      System.out.println(result);


  }

  public static int compareBWStart(int[][] tmpBoard){
    int cnt =0; //칠해야 하는 색깔
    for(int i =0; i<8; i++) {
      for(int j=0; j<8; j++) {
        if(i %2 == 0) { // 0 2 4 6번째줄은 BW와 비교
          if (BW[j] != tmpBoard[i][j]) { //색이다르면 cnt up
            cnt++;
          }
        }
        else { //1 3 5 7번째 줄은 WB와 비교
          if(WB[j] != tmpBoard[i][j]) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }
  public static int compareWBStart(int[][] tmpBoard){
    int cnt = 0; //칠해야 하는 색깔
    for(int i =0; i<8; i++) {
      for(int j=0; j<8; j++) {
        if(i %2 == 0) { // 0 2 4 6번째 줄은 WB와 비교
          if (WB[j] != tmpBoard[i][j]) {
            cnt++;
          }
        }
        else { //1 3 5 7번째 줄은 BW와 비교
          if(BW[j] != tmpBoard[i][j]) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }
}
