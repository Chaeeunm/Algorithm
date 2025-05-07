package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_4949 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      Stack<Character> gwalho = new Stack<>();
      String s = br.readLine();

      //점나올때까지 반복
      if (s.equals("."))
        break;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(' || s.charAt(i) == '[') {
          gwalho.push(s.charAt(i));
        }
        if (s.charAt(i) == ')') {
          if (gwalho.isEmpty() || gwalho.peek() != '(' ) {
            sb.append("no").append('\n');
            break; //반복문 탈출
          }
          else {
            gwalho.pop();
          }
        }
        if (s.charAt(i) == ']') {
          if (gwalho.isEmpty() || gwalho.peek() != '['){
            sb.append("no").append('\n');
            break;
          }
          else {
            gwalho.pop();
          }
        }
        //끝까지 왔고 큐도 비어있으면 yes
        if (i == s.length() - 1) {
          if (gwalho.isEmpty())
            sb.append("yes").append('\n');
          else
            sb.append("no").append('\n');
        }
      }

    }

    System.out.println(sb);
  }
}
