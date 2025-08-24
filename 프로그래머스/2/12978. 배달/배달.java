import java.util.*;

class Solution {
    
    public static class Node implements Comparable<Node>{
        int num;
        int dis;
        Node(int num,int dis){
            this.num = num;
            this.dis = dis;
        }
        
        @Override
        public int compareTo(Node node){
            return Integer.compare(this.dis, node.dis);
        }
    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        int[][] arr = new int[N+1][N+1];
        
        for(int[] now : road){
            int start = now[0];
            int end = now[1];
            int dis = now[2];
            if(arr[start][end] == 0) arr[start][end] = arr[end][start] = dis;
            else arr[start][end] = arr[end][start] = Math.min(arr[start][end], dis);
        }
        
        PriorityQueue<Node> queue = new PriorityQueue<>();
        int[] minDis = new int[N+1];
        int inf = 1000000000;
        Arrays.fill(minDis,inf);
        
        
        queue.offer(new Node(1,0));
        minDis[1] = 0;
        
        while(!queue.isEmpty()){
            Node nowNode = queue.poll();
            if(nowNode.dis > minDis[nowNode.num]) continue;
            //지금 노드에 잇는 거리가 dis에 있는 값보다 크면 continue
            
            //각 노드에 연결된 노드 전부 돌면서
            for(int next =1; next<=N; next++){
                
                if(arr[nowNode.num][next] != 0 && minDis[next] > minDis[nowNode.num] + arr[nowNode.num][next]){
                             
                minDis[next] = minDis[nowNode.num] + arr[nowNode.num][next];
                queue.offer(new Node(next,minDis[next]));
                }
            }
            
            //최솟값 갱신 후 넣음
            
        }
        
        for(int now : minDis){
            if(now <= K) answer++;
        }
        return answer;
    }
}