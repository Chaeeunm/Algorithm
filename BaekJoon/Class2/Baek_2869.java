package BaekJoon.Class2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//달팽이는 올라가고 싶닷~!
public class Baek_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //a만큼 올라감 b만큼 떨어짐 총높이 v
        // (1 ≤ B < A ≤ V ≤ 1,000,000,000)
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if(v == a ){
            System.out.println(1);
        }
        else if ((v-a) % (a-b) ==0 )
        System.out.println((v-a) / (a-b) +1);
        else System.out.println((v-a) / (a-b) +2);
    }

}
