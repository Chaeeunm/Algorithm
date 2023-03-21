package Class2.Baek_2609;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_1158 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        for(int i= 1; i<N+1; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < K-1; i++) { //1부터 K-1까지 뺌
                queue.add(queue.poll()); //꺼낸걸 맨 위에 넣음 1234567
            }
            sb.append(queue.poll()).append(", "); // K번째 수는 sb에 더해줌
        }
        sb.delete(sb.length()-2,sb.length()).append(">");
        System.out.println(sb);
    }
}
