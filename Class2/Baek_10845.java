package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
//큐 => 선입선출

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class Baek_10845 {
    static LinkedList queue= new LinkedList(); //Queue는 ArrayList보다 LinkedList로 구현하는 것이 효율적(비순차적 추가 삭제가 잦음)
    static int size = 0;
    static int front = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append('\n');
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                    break;
                case "front" :
                    sb.append(front()).append('\n');
                    break;
                case "back" :
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int num){
        queue.add(num);
    }
    public static Object pop(){
        if(queue.size()!=0) {
            return queue.poll(); //가장 첫번째 요소 반환
        }
        else return -1;
    }
    public static int size(){
        return queue.size();
    }
    public static int empty(){
        if(queue.size()==0)return 1;
        else return 0;
    }
    public static Object front(){
        if(queue.size()==0)return -1;
        else return queue.element();
    }
    public static Object back(){
        if(queue.size()==0) return -1;
        else return queue.get(queue.size()-1);
    }
}
