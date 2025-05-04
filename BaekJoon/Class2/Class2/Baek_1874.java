package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Baek_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[n];

        for(int i=1; i<= n; i++) {
            q.add(i); //1 2 3 4 5 6 7 8
        }

        for(int i=0; i<n; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }
        int index =0;
        StringBuilder sb = new StringBuilder();
        // 주어진 것 2 3 4 5 6 7 8
        // 목표     4 3 6 8 7 5 2 1 index =1;
        while (q.isEmpty()) {
            //우리가 만들어야 하는 수열의 숫자와 같을때까지 스택에 담아줌
            int tmp = q.poll();
            if(tmp != result[index])
            stack.add(tmp);
            else { //같다면
                index++; //인덱스 한칸 늘려줌
            }
        }

    }
}
