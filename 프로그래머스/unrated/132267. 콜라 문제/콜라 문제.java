class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //마트에 주는 병 수 a
        //a개를 주면 b개를 줌
        //상빈이가 가지고 있는 빈 병의 개수 n
        
        while(n>=a){ //20
            //상빈이가 가진 병의 개수가 마트의 줄 병 수 보다 크거나 같으면
            n -= a;
            n += b; 
            answer += b;
        }
        
        return answer;
    }
}