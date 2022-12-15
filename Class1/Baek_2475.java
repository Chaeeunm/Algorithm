package Class1;
import java.util.*;
public class Baek_2475 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();

            int num = (a*a + b*b + c*c + d*d + e*e)%10;
            System.out.println(num);
        }
    }
