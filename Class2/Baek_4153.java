package Class2;
//4153 직각삼각형
/*문제
  과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
  주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

  입력
  입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
  각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

  출력
  각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //while(입력값이 0,0,0일때까지 입력) {
        while (true) {
            String s = br.readLine();

            if(s.equals("0 0 0")) break;

            String input[] = (s.split(" "));//공백마다 데이터 끊어서 배열에 넣음(세 변의 길이)

            int[] legs = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray(); //String타입의 배열을 int로 바꿔준 후 오름차순 정렬

            /*if (3번째 요소의 제곱 = 1번째요소 제곱 + 2번째 요소 제곱)*/
            if (Math.pow(legs[2], 2) == (Math.pow(legs[0], 2) + Math.pow(legs[1], 2))) {
                sb.append("right");
                sb.append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}

