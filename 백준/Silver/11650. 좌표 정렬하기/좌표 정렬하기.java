import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
       public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           int N = Integer.parseInt(br.readLine());
           String[][] arr = new String[N][2];
           for(int i =0; i<N; i++){
               StringTokenizer st = new StringTokenizer(br.readLine(), " ");
               arr[i][0] = st.nextToken();
               arr[i][1] = st.nextToken();
           }

           Arrays.sort(arr, new Comparator<String[]>() {
               @Override
               public int compare(String[] o1, String[] o2) {
                   int o1X = Integer.parseInt(o1[0]);
                   int o2X = Integer.parseInt(o2[0]);
                   int o1Y = Integer.parseInt(o1[1]);
                   int o2Y = Integer.parseInt(o2[1]);

                   if (o1X != o2X) {
                       return o1X-o2X; //x좌표가 증가하는 순으로 정렬
                   }
                   else return o1Y-o2Y; //x좌표가 같으면 y좌표가 증가하는 순으로 정렬
               }
           });

           StringBuilder sb= new StringBuilder();
           for(int i=0; i<N; i++) {
               sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
           }
           System.out.println(sb);
       }
       }