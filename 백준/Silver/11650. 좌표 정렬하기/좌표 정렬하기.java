
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] co = new int[n][2];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            co[i][0] = Integer.parseInt(st.nextToken());
            co[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(co, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //엑스좌표가 같으면 와이좌표가 증가하는 순으로
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                //그렇지 않으면 엑스좌표가 증가하는 순으로
                return o1[0] -o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        Arrays.stream(co).forEach(a -> sb.append(a[0]).append(" ").append(a[1]).append('\n'));

        System.out.println(sb);
    }
        }
