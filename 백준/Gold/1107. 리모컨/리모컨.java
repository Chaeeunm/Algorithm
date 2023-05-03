import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr = new int[0];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int to = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (n > 0) {
            String[] arrStr = br.readLine().split(" ");
            arr = new int[arrStr.length];
            for (int i = 0; i < arrStr.length; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            Arrays.sort(arr);
        }

        int ans = Math.abs(to - 100);
        for (int i = 0; i <= 1000000; i++) {
            int count = check(i);
            if (count > 0) {
                int press = Math.abs(i - to);
                ans = Math.min(ans, count + press);
            }
        }

        System.out.println(ans);
    }

    static int check(int c) {
        if (c == 0) {
            if (contains(0)) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (c > 0) {
            if (contains(c % 10)) {
                return 0;
            }
            len++;
            c /= 10;
        }
        return len;
    }

    static boolean contains(int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
