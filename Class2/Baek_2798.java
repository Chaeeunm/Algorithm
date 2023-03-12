package Class2;
//2798 블랙잭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        String input[] = s.split(" ");
        /*stream을 통해 int 배열로 바꿔줌*/
        int[] cardNum = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray();

        int minGap = Integer.MAX_VALUE; //M과 차의 최솟값(초깃값은 최대 정수값으로 설정)
        for (int i = 0; i < cardNum.length - 2; i++) {

            for (int j = i + 1; j < cardNum.length - 1; j++) {

                for (int k = j + 1; k < cardNum.length; k++) {
                    int sum = cardNum[i] + cardNum[j] + cardNum[k];
                    int gap = M - sum;

                    /*합이 M을 넘지 않으면서 M에 가장 가까운경우*/
                    if (sum <= M &&gap < minGap) {
                        minGap = gap;
                    }
                }
            }
        }
        System.out.println(M - minGap);
    }
}
