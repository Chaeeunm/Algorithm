class Solution {
    public long solution(int n, int[] times) {
        
    long high = 0;
    for (int time : times) {
    if (time > high) high = time;
    }
    long low = 0;
    high = n* high;
    
    long answer = 0;

    while (low <= high) {
        long mid = (low + high) / 2;
        
        long total = 0;

        for(int time : times) {
            //이 시간동안 해당 심사관이 심사할 수 있는 최대 인원
            total += mid / time;
        }
        if(total >= n ) { //심사 가능하면 분을 줄임
            high = mid -1;
            answer = mid;
        } else low = mid +1;
    }

    //이분탐색하면서 true면 더 작은 부분 탐색(high = mid)하고 result = mid
    //해당 시간동안 n명이상을 심사할 수 있으면 t
    return answer;
    }
}