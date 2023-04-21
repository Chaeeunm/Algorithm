
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
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
