package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< tc; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String,Integer> cloth = new HashMap();
            for(int j =0; j< n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = br.readLine();
                if(cloth.containsKey(kind)){
                    cloth.put(kind,cloth.get(kind)+1);
                }
                else {
                    cloth.put(kind,1);
                }
            }
            int result =1;
            for(int val : cloth.values()){
                result *= (val = 1);
            }
            sb.append(result-1).append('\n');
        }
        System.out.println(sb);
    }
}
