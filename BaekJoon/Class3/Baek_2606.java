package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_2606 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //컴퓨터의 수
        int tc = Integer.parseInt(br.readLine()); //쌍의 수

        int[][] graph = new int[N+1][N+1];
        boolean[] visited = new boolean[N + 1];
        for(int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        Queue<Integer> queue = new LinkedList();
            queue.add(1);
            visited[1] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int a = queue.poll(); //큐에서 꺼낸 수를 로 만들어줌
            count++; //count해줌

            for (int j = 0; j < graph.length; j++) {
                if (graph[a][j] == 1 && visited[j]==false) { //만약 그래프에 연결되어 있는 노드가 있고 아직 방문을 안했다면
                        visited[j] = true; //방문했다고 바꿔주고
                        queue.add(j); //큐에 그 수를 담아줌
                    }
                }
        }
        System.out.println(count - 1);
    }
}
