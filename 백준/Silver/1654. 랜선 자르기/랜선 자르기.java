import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int k = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long[] arr = new long[k];

        long max = 0;
        long sum = 0;

        for(int i = 0; i < k; i++) {
            arr[i] = Long.parseLong(br.readLine());
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        long left = 1;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;

            for (long cable : arr) {
                cnt += cable / mid;
            }

            if (cnt >= n) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}