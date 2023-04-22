package practice;

public class BruteForce {
    static int N=4;
    static int[] nums = {1,2,3,4};
    public static void main(String[] args){

    }
    //순열 (순서가 상관 있는 경우)
    //가장 큰 두자리 숫자 구하는 예

    static int solve(int cnt, int used, int val){
        if(cnt==2) return val; //탈출조건 2자리수가 되었을 때

        int ret = 0; //return값 0으로 초기화
        for(int i=0; i<N; ++i){ //4까지 돌면서
            if((used&1<<1)!=0) continue;
        }
    }
}
