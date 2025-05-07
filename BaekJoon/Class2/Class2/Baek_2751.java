package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_2751 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] arr= new int[2000001];

    while (N-->0) {
      int num = Integer.parseInt(br.readLine());
      arr[num+1000000] ++;
    }

    StringBuilder sb = new StringBuilder();
    for(int i =0; i<arr.length; i++) {
      if(arr[i] >0) {
        for(int j=0; j<arr[i]; j++) {
          sb.append(i -1000000).append('\n');
        }
      }
    }

    System.out.println(sb);

  }
}
