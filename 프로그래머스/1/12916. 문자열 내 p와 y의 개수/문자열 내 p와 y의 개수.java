class Solution {
    boolean solution(String s) {
        String change = s.toUpperCase();
        int p = 0;
        int y = 0;
        for(char now : change.toCharArray()){
           if(now == 'P') p++;
           else if(now == 'Y') y++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("p" +p + "y" + y);

        return p==y;
    }
}