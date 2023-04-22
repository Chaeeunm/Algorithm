import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        String input[] = s.split(" ");
        /*stream을 통해 int 배열로 바꿔줌*/
        int[] cardNum = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray();

        int result=0;
        for (int i = 0; i < cardNum.length - 2; i++) {

            for (int j = i + 1; j < cardNum.length - 1; j++) {

                for (int k = j + 1; k < cardNum.length; k++) {
                    int sum = cardNum[i] + cardNum[j] + cardNum[k];

                    /*합이 M을 넘지 않으면서 가장 큰 경우*/
                    if (result < sum && sum <= M) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}