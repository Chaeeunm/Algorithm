
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int stack[]; //stack 배열을 선언만 해줌 =>참조변수 선언
    public static int size=0; //stack 배열의 데이터 크기(초기값 0)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        stack = new int[N]; // 배열을 생성 => 실제 저장공간을 생성
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
                case "top" :
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    //push , pop, size, empty, top 구현
    public static void push(int num){
        stack[size] = num;
        size++;
    }
    //스택에서 젤 위에 있는 정수를 빼고 그 수를 출력, 만약 스택에 들어있는 정수가 없는 경우 -1을 출력
    public static int pop(){
        if(size==0) return -1;
        else {
            size--;
            return stack[size];
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0) return 1;
        else return 0;
    }
    public static int top(){
        if(size==0) return -1;
        else return stack[size-1];
    }
}
