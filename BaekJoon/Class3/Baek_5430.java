package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Baek_5430 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        //R -> 배열에 있는 수의 순서를 뒤집음
        //D -> 첫번째 수를 버림(비어있는데 사용할 경우 error 출력)

        ArrayDeque<Integer> deque;
        StringTokenizer st;
        //tc받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i =0; i< tc;i++){
            String command = br.readLine(); //함수
            int n = Integer.parseInt(br.readLine()); //원소갯수

            st = new StringTokenizer(br.readLine(),"[],"); //StringTokenizer에 [],제외한 값들을 나누어 처리해줌

            deque = new ArrayDeque<>();

            for(int j =0; j<n; j++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            RD(command,deque);
        }
        System.out.println(sb);


    }
    public static void RD(String command, ArrayDeque<Integer> deque){
        boolean isRight = true;
        for(char cmd : command.toCharArray()){
            if(cmd =='R'){
                isRight = !isRight;
                continue;
            }
            //D이면
            else {
                if(deque.isEmpty()){
                    sb.append("error\n");
                    return;
                }
                else if (isRight) { //정방향이면 앞에서 빼줌
                    deque.pollFirst();
                }
                else{ //역방향이면 뒤에서 빼줌
                    deque.pollLast();
                }
            }
        }
        //for문을 다 돌면
        sb.append('[');
        if(isRight) { //정방향이면 앞에서부터 꺼내줌
            if(deque.size()>0) sb.append(deque.pollFirst());
            while (deque.size()>0){
                sb.append(',').append(deque.pollFirst());
            }
        }
        else {
            if(deque.size()>0) sb.append(deque.pollLast());
            while (deque.size()>0){
                sb.append(',').append(deque.pollLast());
            }
        }
        sb.append(']').append('\n');
    }
}
