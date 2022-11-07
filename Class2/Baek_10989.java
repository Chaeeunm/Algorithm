package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baek_10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list);
        for(String sort : list){
            bw.write(sort + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
