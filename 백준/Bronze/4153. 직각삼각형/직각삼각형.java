
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //while(입력값이 0,0,0일때까지 입력) {
        while (true) {
            String s = br.readLine();

            if(s.equals("0 0 0")) break; //문자열의 비교는 equals!

            String input[] = (s.split(" "));//공백마다 데이터 끊어서 배열에 넣음(세 변의 길이)

            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray(); //String타입의 배열을 int로 바꿔준 후 오름차순 정렬

            /*if (3번째 요소의 제곱 = 1번째요소 제곱 + 2번째 요소 제곱)*/
            if (Math.pow(arr[2], 2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2))) {
                sb.append("right");
                sb.append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}