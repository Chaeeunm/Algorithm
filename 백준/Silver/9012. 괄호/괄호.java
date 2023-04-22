import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int count = 0;
            String ps = br.readLine();
            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') count++;
                else if (ps.charAt(j) == ')') count--;
                if(count<0) break; //반복문 벗어나고 count != 0이기에 NO 출력
            }
            if (count == 0) sb.append("YES").append('\n');
            else sb.append("NO").append('\n');
        }
        System.out.println(sb);
    }
}