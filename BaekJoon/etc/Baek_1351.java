package BaekJoon.etc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Baek_1351 {
    public static HashMap<Long,Long> dp = new HashMap<>();
    public static long p;
    public static long q;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        p = sc.nextLong();
        q = sc.nextLong();

        System.out.println(su10(n));
    }

    public static long su10(long num) {
        if(num ==0) return 1;
        else if(dp.containsKey(num)) return dp.get(num);
        else {
            long result = su10(num / p) + su10(num / q);
            dp.put(num, result);
            return result;
        }
        }
}
