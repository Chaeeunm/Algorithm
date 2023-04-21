class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        answer = check(s);
        return answer;
    }
    
    static boolean check(String s){
        int l =s.length();
        if(l!=4&&l!=6) return false;
        for(int i=0; i<s.length(); i++){
            int asc = (int)s.charAt(i);
            if(asc<=90&&asc>=65||asc<=122&&asc>=97){
                return false;
            }
        }
        return true;
    }
}