package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beak_18110 {
    public static void main(String[] args) throws IOException {
        //의견 X -> 난의도 0
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        double sum = 0;
        int result = 0;

        double b = Math.round(((double)N) * 0.15);
        int intB = (int) b;

        double[] level = new double[N];

        for(int i=0; i<N; i++){
            level[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(level); //1 2 3 4 5 15% 1 4
        for(int i= intB; i< N - intB; i++) {
            sum += level[i];
        }
        if(N != 0) result = (int)Math.round(sum / ((double)N - (2.0 * b)));
        System.out.println(result);
    }
}
