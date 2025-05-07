import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> st = new Stack<>();

    for(int i =1 ; i<=n; i++) {
      q.add(i);
    }

    int index =0;
    int[] compare = new int[n];
    for(int i =0; i<n; i++){
      compare[i] = Integer.parseInt(br.readLine());
    }

    //일단 스택에 수 하나 넣고 sb에 '+'추가
    StringBuilder sb = new StringBuilder();
    st.push(q.poll());
    sb.append('+').append('\n');

    while (!q.isEmpty()){
      if(st.isEmpty()) {
        st.push(q.poll());
        sb.append('+').append('\n');
      }
      //스택 젤 위에 있는거랑 지금 index 비교해서 같으면 빼주고 sb에 '-'추가 index ++
      else if(st.peek() == compare[index]){
        st.pop();
        index ++;
        sb.append('-').append('\n');
      }
      // 다르면 또 넣음 sb에 '+'추가
      else {
        st.push(q.poll());
        sb.append('+').append('\n');
      }
    }
    while (!st.isEmpty()){
      if(st.peek() == compare[index]){
        st.pop();
        index ++;
        sb.append('-').append('\n');
      }
      else break;
    }
    //만약 index ==n-1이면 sb출력 그렇지 않으면 NO출력
    String result = (index == n)? sb.toString(): "NO";
    System.out.println(result);
  }
}