
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        //3kg, 5kg
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = -1;
        int a = N/5;

        if(N%5 == 0 ) cnt = a;
        else {
        while (a>=0) {
            if((N-(a*5))%3 ==0) {
                cnt = a + (N-(a*5))/3;
                break;
            }
            else a--;
        }
       }

        System.out.println(cnt);

    }
}
