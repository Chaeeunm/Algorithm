package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek_11723_2 {
  public static void main(String[] args) throws IOException {

    HashMap<Integer, Integer> now = new HashMap<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String s = st.nextToken();
      if (s.equals("add")) {
        int tmp = Integer.parseInt(st.nextToken());
        if (!now.containsKey(tmp))
          now.put(tmp, 1);
      }
      else if (s.equals("check")) {
        int tmp = Integer.parseInt(st.nextToken());
        if (!now.containsKey(tmp))
          sb.append("0").append("\n");
        else
          sb.append("1").append("\n");
      }
      else if (s.equals("remove")) {
        int tmp = Integer.parseInt(st.nextToken());
        now.remove(tmp);
      }
      else if (s.equals("toggle")) {
        int tmp = Integer.parseInt(st.nextToken());
        if (now.containsKey(tmp))
          now.remove(tmp);
        else
          now.put(tmp, 1);
      }
      else if (s.equals("all")) {
        now = new HashMap<>();
        for (int i = 1; i < 21; i++) {
          now.put(i, 1);
        }
      }
      else if (s.equals("empty")) {
        now.clear();
      }
    }
    System.out.println(sb);
  }
}
