package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_9012 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    while (n -->0) {
      Stack<Character> g = new Stack<>();
      String s = br.readLine();

      for(int i =0 ; i<s.length(); i++) {
        if(s.charAt(i) == '(') {
          g.push(s.charAt(i));
        }
        else{
          if(g.isEmpty() || g.peek() != '(') {
            sb.append("NO").append('\n');
            break;
          }
          else g.pop();
        }
        if(i == s.length()-1) {
          if(g.isEmpty()){
            sb.append("YES").append('\n');
          }
          else sb.append("NO").append('\n');
        }
      }
    }

    System.out.println(sb);
  }
}
