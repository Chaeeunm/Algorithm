import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        //CharArray로 바꾼 후 큐에 넣음
        Queue<Character> queue = new LinkedList<>();
        for(Character now : s.toCharArray()){
            queue.add(now);
        }
        for(int i =0; i< s.length(); i++){
            if(isCorrect(queue)) {
                answer++;
            }
            queue.add(queue.poll());
        }
        return answer;
    }
    
    
    public static boolean isCorrect(Queue<Character> queue){
       Queue<Character> tmp = new LinkedList<>(queue);
       Deque<Character> stack = new ArrayDeque<>();
        while(!tmp.isEmpty()){
        Character now = tmp.poll();
        //System.out.println("현재 문자: " + now + " | stack: " + stack + " | last : "+ stack.peekFirst());
        if(now == ')') {
            if(stack.isEmpty() || '(' != stack.pollFirst()){
                return false;
            }
        }
        else if(now == '}') {
            if(stack.isEmpty() || '{' != stack.pollFirst()){
                return false;
            }
        }
        else if(now == ']') {
            if(stack.isEmpty() || '[' != stack.pollFirst()) {
                return false; 
            }
       } else{
            stack.push(now);
        }
        }
       return stack.size() == 0; 
    }
}