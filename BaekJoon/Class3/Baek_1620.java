package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek_1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        HashMap<Integer,String> pocketmon = new HashMap<>(M); // HashMap은 저장공간보다 값이 추가로 들어오면 약 두배로 늘립니다. 과부하 발생할 수 있기에 초기 저장공간 설정해주는게좋음

        for (int i=0;i<M; i++){
            pocketmon.put(i,br.readLine());
        }
        while(N-->0){

        }
    }
}
