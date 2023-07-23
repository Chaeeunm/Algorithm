package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek_17219 {
    public static void main(String[] args) throws IOException {
        //hashmap의 get 함수의 시간복잡도는 o1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int pn = Integer.parseInt(st.nextToken());

        int fn = Integer.parseInt(st.nextToken());

        HashMap<String,String> pw = new HashMap<>(pn);

        for(int i=0; i< pn; i++){
            StringTokenizer p = new StringTokenizer(br.readLine()," ");
            pw.put(p.nextToken(),p.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< fn; i++){
            sb.append(pw.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
