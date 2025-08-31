import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[] dRow = {-1,1,0,0}; //상 하 좌 우
    static int[] dCol = {0,0,-1,1};
    static int sero;
    static int garo;
    public int solution(int[][] maps) {
        sero =  maps.length;
        garo = maps[0].length;
        visited = new boolean[sero][garo];
        int answer = bfs(maps);
        
        
        //최소값 구하기
        
        return answer;
    }
    
    public static int bfs(int[][] maps){
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[] now = q.poll();
          //  System.out.println("nowRow :"+ now[0] + " | nowCol : "+ now[1] +" | nowCnt : " + now[2]);
            //상하좌우 방문
            for(int i =0; i<4; i++){
                int nextRow = now[0] + dRow[i];
                int nextCol = now[1] + dCol[i];
                if(nextRow >= sero || nextRow < 0 || nextCol >= garo || nextCol < 0) continue;
                if(!visited[nextRow][nextCol] && maps[nextRow][nextCol] == 1) {
                    if(nextRow == sero-1 && nextCol == garo -1) return now[2] +1;
                  //   System.out.println("nextRow :" +nextRow + " | nextCol : "+ nextCol + " | queue : " +q);
                    visited[nextRow][nextCol] = true;
                    q.offer(new int[]{nextRow,nextCol,now[2]+1});
                }
            }
        }
        return -1;
    }
}