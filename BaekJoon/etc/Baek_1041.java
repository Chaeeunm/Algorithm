package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Baek_1041 {
    int[] num = new int[2];
    static int m2 = 100;
    static int m3 = 150;
    static int m1 =50;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        int i =0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        //A=0 B=1 C=2 D=3 E=4 F=5
        //CD,AF,EB는 안됨
        for(int j=0; j<6; j++){
            for(int k=1; k<6; k++) {
                if (j == k || (j== 2 && k==3) || (k==2&& j==3) ||(k==0&& j==5)||(k==0&& j==5)||(k==4&& j==1)||(k==4&& j==1)) continue;
                else m2 = Math.min(m2,arr[j]+arr[k]);
            }
        }
        //마주보는 면끼리는 같이 할 수 없음을 이용
        //마주보는 면에 있는 수 중 더 작은수를 더함
        //EB //DC //AF 끼리 마주보고 있음
        m3 = Math.min(arr[0],arr[5]) +Math.min(arr[1],arr[4]) + Math.min(arr[2],arr[3]);
        for(int j =0; j<6; j++) {
            m1 = Math.min(m1, arr[j]);
        }
        System.out.println("m1 :" + m1 + ", m2 :" + m2 + ", m3 :" + m3);
        System.out.println(dice(N));

    }
//1개 면 보일때 ->1 //2개 면 보일떄 -> 3 //3개 면 보일떄 ->6

//3개 면 보이는 주사위: 무조건 4개
// 2개 면 보이는 주사위 (n-1)*4+(n-2)*4 = 4(2n-3) = 8n-12개 => (8n-12)*3 = 24n-36
// 1개 면 보이는 주사위: 4(n-2)(n-1)+(n-2)^2 = 5n^2 - 16n + 12
    static int dice(int N){
        int result3 = 4*m3;
        int result2 = (24*N -36)* m2;
        int result1 = (5*N*N -16*N +12) *m1;

        return result1+result2+result3;
    }

}
