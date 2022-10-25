package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8958
public class Baek_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int score = 0;
        String[] input = new String[num];

        for (int i = 0; i < num; i++) {
            input[i] = br.readLine();
        }
        for (int k = 0; k < num; k++) {
            for (int j = 0; j < input[k].length(); j++) {
                if (input[k].charAt(j) == 'O') {
                    count++;
                    score += count;
                } else if (input[k].charAt(j) == 'X') {
                    count = 0; //카운트 초기화
                }
            }
            sb.append(score).append('\n');
            score=0; //배열 요소 하나를 돌고 나면 score 초기화
            count=0;
        }

        System.out.print(sb);
    }
}
