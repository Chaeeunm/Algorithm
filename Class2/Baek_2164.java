package Class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_2164 {
    //제일 위에 있는 카드(1)를 바닥에 버린다.
    //제일 위에 있는 카드를 젱ㄹ 아래에 있는 카드(N) 밑으로 옮긴다.
    //N이 주어졌을 때 제일 마지막에 남게 되는 카드를 구하자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>(); //Queue 생성

        for (int i = 1; i <= N; i++) { // 큐에 N까지 채워넣음 1 2 3 4 5
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll(); //젤 위의 카드 버림
            q.add(q.poll()); //젤 위의 카드 젤 밑으로 옮김
        }
        System.out.println(q.poll());

    }
}
