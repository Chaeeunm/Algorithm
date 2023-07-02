import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
     List<Integer> scores = new ArrayList<>();  // 사진들의 추억 점수를 담을 리스트

        for (String[] people : photo) {
            int score = 0;
            for (String person : people) {
                for (int i = 0; i < name.length; i++) {
                    if (person.equals(name[i])) {
                        score += yearning[i];  // 해당 인물의 그리움 점수를 더함
                        break;
                    }
                }
            }
            scores.add(score);
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[scores.size()];
        for (int i = 0; i < scores.size(); i++) {
            answer[i] = scores.get(i);
        }
        return answer;
    }
}