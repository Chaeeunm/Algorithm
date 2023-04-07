package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1003 {
    //0일떄는 1 0
    //1일때는 0 1
    //메모이제이션 사용해서 시간을 효율적이게 할 것
    static int[] c0= new int[41];
    static int[] c1 = new int[41];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //들어올 수
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(C0(num)).append(" ").append(C1(num)).append("\n");
        }
        System.out.println(sb);
    }

    public static int C0(int num){
        if(c0[num]>0) return c0[num];
        if(num==0) return 1;
        else if(num==1) return 0;
        else return c0[num] = C0(num-1) + C0(num-2);
    }
    public static int C1(int num){
        if(c1[num]>0) return c1[num];
        if(num==0) return 0;
        else if(num==1) return 1;
        else return c1[num] = C1(num-1) + C1(num-2);
    }
}
