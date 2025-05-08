package BaekJoon.etc;
//문제정리
//NXN (2 <= N <= 20)
//물고기 M 마리 크기 (1~6)
//상어 1마리(초기 크기 2), 1초에 상하좌우 인접 한칸씩 이동가능
//자신보다 작은 물고기 먹을 수 있음
//작거나 같은 물고기 있는 칸 지나갈 수 있음

//먹을 수 잇는 물고기 없으면 끝
//먹을 수 있는 물고기 1마리 이상 -> 1. 가까운 물고기부터, 2. 가장 위에 있는 물고기부터, 3. 가장 왼쪽에 있는 물고기부터 먹는다
//이동과 동시에 물고기를 먹음(빈칸됨)

//자신의 크기만큼의 물고기 수를 먹을 때 1씩 증가

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_16236 {

  static int n;
  static int[][] map;
  static boolean[][] visited;
  //상 0,-1 좌-1,0 우1,0 하0,1
  static int[] dx = new int[]{0,-1,1,0};
  static int[] dy= new int[]{-1,0,0,1};
  static int result =0;


  static class Shark{
    int x;
    int y;
    int size;
    int eat;
    int time;

    public Shark(int x, int y, int size, int eat, int time){
      this.x = x;
      this.y = y;
      // 만약 먹은 물고기 수가 상어 크기 수와 같다면 먹은 물고기수 0, 상어크기 +1/
      // 더 작다면 먹은 물고기수 +1, 상어크기 동일)
      if(eat == size) {
        this.eat = 0;
        this.size = size+1;
      } else {
        this.eat = eat;
        this.size = size;
      }
      this.time = time;
    }

    private void setLocation(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    n = Integer.parseInt(br.readLine());
    map = new int[n][n];
    visited = new boolean[n][n];
    Shark first = new Shark(0,0,2,0,0);

    for(int i =0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<n; j++) {
        int num = Integer.parseInt(st.nextToken());
        if(num == 9) {
          first.setLocation(j,i);
          map[i][j]= 0;
        } else map[i][j]= num;
      }
    }
    //풀이
    //상어객체 : 9인곳 좌표 + 상어 크기(2) + 먹은 물고기 수, result = 0; / time 넣음
    //visited 배열 필요
    bfs(first);

    System.out.println(result);
  }

  static void bfs(Shark first){
    Queue<Shark> queue = new LinkedList<>();
    visited = new boolean[n][n];

    queue.offer(first);
    visited[first.y][first.x] = true;

    List<Shark> fishes = new ArrayList<>();
    int min = n*n; // 먹을수 있는 물고기 최소 거리


    while (!queue.isEmpty()){
      Shark shark = queue.poll();
     // if(shark.distince > min) continue;
      //상 , 좌 , 하 , 우 순으로 돌면서 방문 안한곳 방문, 물고기 탐색
      for(int i =0; i<4; i++) {
        int changeX = shark.x + dx[i];
        int changeY = shark.y + dy[i];

        //배열 밖 벗어나면 다음턴
        if(changeX <0|| changeX>= n|| changeY<0|| changeY>=n) {
          continue;
        } //방문 안했고 물고기 크기가 상어 크기보다 작으면 지나감
        if(!visited[changeY][changeX] && map[changeY][changeX] <= shark.size) {
          visited[changeY][changeX] = true;
          //해당좌표 0일 시 Shark에 좌표만 변경
          if(map[changeY][changeX] ==0) {
            queue.offer(new Shark(changeX,changeY,shark.size, shark.eat, shark.time+1));
          }
          //물고기 발견 시 (해당 좌표 0이 아닐 시)
          if(map[changeY][changeX] !=0) {
            // 같으면 -> 상어 객체 좌표 해당 좌표로 변경 , 크기, 먹은 물고기 수 , time+1
            if(map[changeY][changeX] == shark.size){
              queue.offer(new Shark(changeX,changeY,shark.size, shark.eat, shark.time+1));
            }
            // 물고기 크기가 상어 크기보다 작으면 먹음, ->
            if(map[changeY][changeX] < shark.size){
              // 상어 객체 해당 좌표로 변경, 크기, 먹은 물고기수 +1  해당 그래프 0으로 바꿈
              // time+1 result = time+1로 갱신
              // visited 배열 초기화
              result = shark.time +1;
              map[changeY][changeX] = 0;
              resetVisited();
              bfs(new Shark(changeX,changeY,shark.size, shark.eat +1, shark.time+1));
            }
          }

        }
      }
    }
  }


  static void resetVisited() {
    visited = new boolean[n][n];
  }

}

