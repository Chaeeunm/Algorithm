class Solution {
    int[] dx = {1, 0, -1};
    int[] dy = {0, 1, -1};
    static int dp[] = new int[1001];
    public int[] solution(int n) {
        
        dp[1] = 1;
        dp[2] = 3;
        int width = calculate(n);
       // System.out.println(width);
        //아래(row + 1 , col)  옆(row , col -1) 위(row - 1, col - 1)
        int[][] arr = new int[n][n];
        
        //배열크기 int [n][n]
        //int i = 1 부터 3*n까지 반복
        int length = n;
        int nowRow = -1;
        int nowCol = 0;
        int nowNum = 1;
        
        while(length > 0){
              //n번씩 i 하나 늘려가며
            for(int k =0; k< 3; k++){ //dx dy -1 , -1 
               for(int j = 0; j < length; j++){ //j = 0 length = 2 n = 4
                   if(nowNum > width) break;
                    nowRow += dx[k]; //nowRow + dx = 2 , 2
                    nowCol += dy[k];
                    arr[nowRow][nowCol] = nowNum; // arr [2][2] = 8;
          // System.out.println("nowRow " + nowRow + " nowCol " + nowCol+ "nowNum " + nowNum + "length = "+ length + " k = " + k);
                   nowNum++;  //nowNum = 8;
                }
                length--;
            }
          //아래, 옆 위로 이동하며 I를 채우기(I++) N번 반복
          //N번반복이 끝나면 N-- 
            //1 ->1
            //2 -> 3 
            //3 -> 6
            //4 -> 10
            //5 -> 15
            //6 -> 21
            //7 -> dp[n] + n;
        }
        int[] answer = new int[width];
        int idx = 0;
        
        for(int[] row : arr){
            for(int cell : row){
                if(cell == 0) break;
                answer[idx] = cell;
                idx++;
            }
        }
        
        return answer;
    }
    
    public static int calculate(int n) {
        if(dp[n] != 0) return dp[n];
        return dp[n] = calculate(n-1) + n;
    }
}