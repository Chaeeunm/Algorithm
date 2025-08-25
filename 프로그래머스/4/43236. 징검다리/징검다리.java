import java.util.*;
//21시 10분
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        long answer = 0;
        
        Arrays.sort(rocks);
        long min = 1;
    
        long max = distance;
        
        while(min<=max){
            long mid = (max + min) /2;
            if(isPossible(mid,distance,rocks,n)){
                //가능하면 더 큰값 탐색
                min = mid + 1;
                answer = Math.max(answer,mid);
            } else{
                max = mid-1;
            }
        }
        
        
        return (int)answer;
    }
    
    //최솟값이 mid를 넘지않도록 바위 n개 제거할수있나?
    public static boolean isPossible(long dis, int end, int[] rocks, int n){
        int prev = 0;
        int cnt = 0;

        for (int rock : rocks) {
            if (rock - prev < dis) {
                cnt++;
                if (cnt > n) return false;
            } else {
                prev = rock;
            }
        }

        // 마지막 도착점 처리
        if (end - prev < dis) cnt++;

        return cnt <= n;
    }
}