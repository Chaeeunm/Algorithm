package Programmers.BFS_DFS;

public class targetNumber {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer =0;
        dfs(0,0,numbers,target);
        return answer;
    }
    static void dfs(int index, int sum, int[]numbers, int target){
        if(index==numbers.length){ //index 길이가 배열의 끝까지 오면 탈출
            if(sum==target){ //그러면서 sum이 target과 일치하면 answer++
                answer++;
            }
            return;
        }
        //index를 하나씩 늘려가며 빼거나/더하는 두가지 경우로 나누어 재귀를 돌림
        dfs(index+1, sum+numbers[index], numbers, target);
        dfs(index+1, sum-numbers[index], numbers, target);
    }
}

