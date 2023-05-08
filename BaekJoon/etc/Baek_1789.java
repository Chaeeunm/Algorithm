package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_1789 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long n = 1;
        while (true){
            long sum = n * (n+1) / 2; //1부터 n까지의 합
            if(sum>S){
                n--;
                break;
            }
            else n++;
        }
        System.out.println(n);
        //n이 S보다 작거나 같을 때까지만
        //n++ 하면서
    }
}