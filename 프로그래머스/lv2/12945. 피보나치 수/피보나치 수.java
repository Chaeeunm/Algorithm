class Solution {
    static int[] dp; 
    public int solution(int n) {
        int answer = 0;        
        dp = new int[n+1];
        
        dp[1] = 1;
        dp[2] = 1;
        answer = fibo(n);
        
        return answer; 
    }
    static int fibo(int n){
        if(n<3||dp[n]!=0) return dp[n];
        return dp[n] = (fibo(n-1) + fibo(n-2))%1234567;
    }
}