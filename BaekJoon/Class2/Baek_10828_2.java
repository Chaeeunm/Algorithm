package BaekJoon.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_10828_2 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //push X: 정수 X를 스택에 넣음
    // pop: 스택에서 가장 위에 있는 정수를 빼고, 출력. ㅇ벗는 경우 -1
    // size: 스택에 들어있는 정수의 개수를 출력.
    // empty: 스택이 비어있으면 1, 아니면 0을 출력.
    // top: 스택의 가장 위에 있는 정수를 출력. 없는 경우 -1을 출력.
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    Stack stack= new Stack();
    while (n --> 0) {
      st = new StringTokenizer(br.readLine(), " ");
      String s = st.nextToken();
      if(s.equals("push")) stack.push(Integer.parseInt(st.nextToken()));
      if(s.equals("pop")) stack.pop();
    }
  }
}
