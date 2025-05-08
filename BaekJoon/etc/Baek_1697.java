package BaekJoon.etc;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_1697 {
  public static void main(String[] args) throws IOException {
    //몇번째로 여기가는게 최소인지
    boolean[] visited = new boolean[200002];

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sister = sc.nextInt();
    int time = 0;

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{n,0});
    visited[n] = true;

    while (!queue.isEmpty()) {
      int[] now = queue.poll();

      int subin = now[0];
      time = now[1];

      if(subin == sister) {
        break;
      }

      if(subin < 100000 && !visited[2*subin]) {
        queue.offer(new int[] {2 * subin, time + 1});
        visited[2 * subin] = true;
      }
        if(subin < 100000 &&!visited[subin+1]) {
          queue.offer(new int[] {subin + 1, time + 1});
          visited[subin + 1] = true;
        }
        if(subin != 0 &&!visited[subin-1]) {
          queue.offer(new int[] {subin - 1, time + 1});
          visited[subin - 1] = true;
        }
    }

    System.out.println(time);


  }
}
