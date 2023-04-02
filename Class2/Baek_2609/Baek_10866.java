package Class2.Baek_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek_10866 {

    static LinkedList deque = new LinkedList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;
                case "pop_back":
                    sb.append(pop_back()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    //push_front X: 정수 X를 덱의 앞에 넣는다.
    //push_back X: 정수 X를 덱의 뒤에 넣는다.
    //pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    //pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    //size: 덱에 들어있는 정수의 개수를 출력한다.
    //empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
    //front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    //back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    public static void push_front(int num){
        deque.add(0,num);
    }
    public static void push_back(int num){
        deque.add(deque.size(),num);

    }
    public static Object pop_front(){
        return(deque.size()!=0) ? deque.pollFirst(): -1;
    }
    public static Object pop_back(){
        return(deque.size()!=0) ? deque.pollLast(): -1;
    }
    public static int size(){
        return deque.size();
    }
    public static int empty(){
        return (deque.isEmpty())? 1:0;
    }
    public static Object front(){
        return (deque.isEmpty())? -1:deque.peek();
    }
    public static Object back(){
        return (deque.isEmpty())? -1:deque.peekLast();
    }
}
