class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] all = new int[n];
        
        for(int i=0; i<lost.length; i++){
            all[lost[i]-1]--; //체육복 없는 사람 배열은 -1로 바꿔줌
        }
        for(int i=0; i<reserve.length; i++){ //체육복 있는 사람은 1을 더함
            all[reserve[i]-1]++;
        }
        //앞에서 부터 검사하면서 앞에서부터 채워주면 됨
        for(int i=0; i<n; i++){
            if(all[i]<0){
                if(i>0&&all[i-1]>0){
                    all[i-1]--;
                    all[i]++;//all.length = n, 인덱스는 n-1까지
                }
                else if(i < n-1&&all[i+1]>0){
                    all[i+1]--;
                    all[i]++;
                }
            }
        }
        //for문이 끝남
        for(int i=0; i<all.length; i++){
            if(all[i]>=0) answer++;
        }
        
        return answer;
    }
}