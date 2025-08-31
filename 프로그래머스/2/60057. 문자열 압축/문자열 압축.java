class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i<= s.length()/2; i++){
            System.out.println("length = " + i);
            answer = Math.min(answer, zip(s,i));
        }
        
        return answer;
    }
    ///겹치지 않을떄는 aabb 앞에 숫자가 안붙는군
    public static int zip(String s, int length){
        //int result = length + (s.length() % length);
        // System.out.println(result);
        int nowCnt = 1;
        int start = length; //tmp 와 비교할 문자 첫번째 인덱스
        String tmp = s.substring(0, length); //비교 문자 초기값
        StringBuilder sb = new StringBuilder();

        while(start <= s.length() - length){ 
            String now = s.substring(start, start + length);
           // System.out.println("tmp : " + tmp + ", now : " + now + ", nowCnt : " + nowCnt);
            if(tmp.equals(now)){
                nowCnt++;
            } else{
                if(nowCnt > 1){
                    sb.append(nowCnt);
                }
               // result += String.valueOf(nowCnt).length() + length;
                sb.append(tmp);
                nowCnt = 1;
            }
            //equls로 다 같으면 cnt++
            //하나라도 다른거 있으면 cnt.toString더해주기 , cnt =1;
            start += length;
            tmp = now;
    } 
        if(nowCnt > 1) {sb.append(nowCnt);}
        sb.append(tmp);
        int spare = s.length() % length;
        if(spare > 0){
            sb.append(s.substring(s.length() - spare, s.length()));
        }
        
        
       // System.out.println(sb + " length : " + sb.length());
        return sb.length();
    }
}