import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken()); //물이 새는 곳 개수
        int L = Integer.parseInt(st.nextToken()); //테이프 길이
        int count = 1;

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr); //오름차순 정렬

        int start = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-start>L-1) {
                count++;
                start = arr[i];
            }
        }
        System.out.println(count);
    }
}
