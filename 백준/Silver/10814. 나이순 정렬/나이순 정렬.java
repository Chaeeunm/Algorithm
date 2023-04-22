import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
          public static void main(String[] args) throws IOException {

              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              int N = Integer.parseInt(br.readLine());//string으로 입력받기 때문에 형변환 필요

              //나이순, 나이가 같으면 입력 들어온 순서대로 정렬
              //2차 배열을 만들어 나이 순으로 정렬해주기
              String arr[][] = new String[N][2];
              for(int i =0; i<N; i++){
                  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                  arr[i][0]=st.nextToken(); //나이
                  arr[i][1]=st.nextToken(); //이름
              }

              Arrays.sort(arr, new Comparator<String[]>() {
                  @Override
                  public int compare(String[] o1, String[] o2) {
                      return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                  }
              });

              StringBuilder sb = new StringBuilder();

              for(int i = 0; i<N; i++){
                  sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
              }

              System.out.println(sb);
          }
}