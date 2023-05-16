package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_7576 {
    static int[][] box;
    static Queue<Integer> tomato = new LinkedList<>();
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
    }
    //모든 구역을 탐색(모두 익을 때까지)
    static void bfs(int start){

    }
    //상하좌우를 넣어줌..?
}