package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class two_dim {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[][] strs = new String[3][4];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                strs[i][j] = st.nextToken();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sb.append(strs[i][j]).append(' ');
            }
            sb.append('\n');
            sb.append('\n');
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                sb.append(strs[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
