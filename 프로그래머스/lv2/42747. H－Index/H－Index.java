// import java.util.Arrays;
// import java.util.Collections;

// class Solution {
//     public int solution(int[] citations) {
//         int answer = 0;

//         Arrays.sort(citations); //오름차순 정렬
        
//         int li= citations.length -1; 
//         int count =1;
        
//         for(int i=li; i>=0; i--){
//             if(count++ >= citations[i]) { //h보다 큰 논문의 갯수 >= h
//                 answer = citations[i];
//                 break;
                
//             }
//         }
//         return answer;
//     }
// }


import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;   // 논문 개수

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }
}