import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        List<String> result = new ArrayList<>();
        Map<String, String> names = new HashMap<>();
        
        for(String now : record){
            String[] userInfo = now.split(" ");
            if(!userInfo[0].equals("Leave")){
            names.put(userInfo[1], userInfo[2]);
            }
        }
    
        for(String now : record){
           String[] userInfo = now.split(" ");
            if(userInfo[0].equals("Enter")){
                result.add(names.get(userInfo[1]) + "님이 들어왔습니다.");
            }
            else if(userInfo[0].equals("Leave")){
                result.add(names.get(userInfo[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[result.size()];
        
        for(int i  =0; i< answer.length; i++){
            answer[i] = result.get(i);
        }
        
        //result에 Enter면 uid set에서 찾은값 + 님이 들어왔습니다. 담기
        return answer;
    }
}