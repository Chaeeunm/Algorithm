
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger result = new BigInteger("1");
        while (n-->0) {
            result = result.multiply(BigInteger.valueOf(n+1));
        }

        String s = result.toString();
        int cnt =0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                cnt++;
            }
            else break;
        }
        System.out.println(cnt);
    }
}
