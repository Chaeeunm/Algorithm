
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int count =0;

        while(sugar>0){
            if(sugar%5==0){
                count += sugar/5;
                sugar = 0;
        }
            else {
                sugar -= 3;
                count++;
    }
        }
        int result = (sugar ==0)?count:-1;
        System.out.println(result);
    }
}
