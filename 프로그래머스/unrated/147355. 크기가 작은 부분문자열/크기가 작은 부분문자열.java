class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int l = p.length();
        
        try {
            long v = Long.parseLong(p);
            
            for (int i = 0; i <= t.length() - l; i++) {
                String substring = t.substring(i, i + l);
                if (substring.matches("\\d+")) {
                    long s = Long.parseLong(substring);
                    if (s <= v) {
                        answer++;
                    }
                }
            }
        } catch (NumberFormatException e) {
            // 숫자로 변환할 수 없는 형식의 문자열 처리
            return answer;
        }
        
        return answer;
    }
}