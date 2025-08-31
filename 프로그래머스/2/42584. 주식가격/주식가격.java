import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerFirst(0);
        
        for(int i  =1; i< prices.length; i++){
           // System.out.println("stack : " +stack + " | prices[stack.peekFirst()]  : "+prices[stack.peekFirst()] + " prices[i] :" +  prices[i] + " i :" + i);
            while(!stack.isEmpty() && prices[stack.peekFirst()] > prices[i]) {
             //   System.out.println("작아용");
                int nowTime = stack.pollFirst();
                answer[nowTime] = i - nowTime;
            }
            stack.offerFirst(i);
        }
        
        while(!stack.isEmpty()){
            int nowTime = stack.pollFirst();
            answer[nowTime] = prices.length -1 - nowTime;
        }
        return answer;
    }
}