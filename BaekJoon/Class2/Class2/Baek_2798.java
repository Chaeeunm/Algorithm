package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2798 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine(), " ");

    int[] cards = new int[N];
    int select = M - (cards[0] + cards[1] + cards[3]);
    for(int i =0; i<N; i++){
      cards[i] = Integer.parseInt(st.nextToken());
    }

    for(int f=0; f<N-2; f++){
      int sum = cards[f];
      for(int s = f+1; s<N-1; s++) {
        sum += cards[s];
        for(int t = s+1; t<N; t ++) {
          sum += cards[t];
          select = Math.min(M-sum,select);
        }
      }
    }
    System.out.println(M - select);

  }
}
