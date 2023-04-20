package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ddm {
    public static void main(String[] args) throws IOException {

        String[][] strs = new String[5][5];

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<5; i++){
            strs[i] = br.readLine().split(" ");
        }
        String result = ppm(strs);
        System.out.println(result);

    }
    public static String ppm(String[][] strs) {
        for (int i = 0; i < 5; i++) {
            int num = Math.abs(Integer.parseInt(strs[i][i]));
            int rem = 0;
            for (int j = 0; j < 5; j++) {
                rem += Math.abs(Integer.parseInt(strs[i][j]));
            }
            rem -= num;
            if (num < rem) return "no";
        }
        return "yes";
    }
}
