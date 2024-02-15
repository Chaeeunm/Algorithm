
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = s; i <= e; i++) {
            if (i == 1)
                continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}