package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =0;
        String[] strings = br.readLine().split("-"); //-기준으로 나눠주기

        int[] first = Arrays.stream(strings[0].split("\\+")).mapToInt(Integer::parseInt).toArray();

        for(int i : first){
            ans += i;
        }
        for(int j=1; j< strings.length; j++){
            String s = strings[j];
            int[] others = Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).toArray();
            for(int i : others){
                ans -= i;
            }
        }
        System.out.println(ans);

    }
}
