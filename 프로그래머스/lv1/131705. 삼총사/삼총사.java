class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int l = number.length;
        for(int i=0; i<l-2; i++){
            int a = number[i] ;
            for(int j= i+1; j<l-1; j++){
                int b = number[j];
                for(int k = j+1; k<l; k++){
                    int c = number[k];
                    if(a+b+c==0) answer++;
                }
            }
        }
        return answer;
    }
}