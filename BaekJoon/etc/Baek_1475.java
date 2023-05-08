package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1475 {
    static int[] arr = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        System.out.println(roomNum(A));

    }
//이렇게 말고 문자열 비교로 해야할듯
    static int roomNum(int A){
        if(A==0) return 1;
        int count =0;
        while (A>0){
            //끝자리수 구해줌
            int L = A%10;
            //끝자리수 없애줌
            A /= 10;
            //만약 끝자리수가 9라면 6으로 바꿔줌
            if(L==9) L=6;
            //arr[끝자리수] = 1보다 크면 arr[끝자리수]--해주고
            if(arr[L]>0) arr[L]--;
            //그렇지 않으면(0이면) count++ 후 배열 초기화하고 반복물 계속
            else{
                count++;
                resetArr();
            }
        }
        return count;
    }
    static void resetArr(){
        for(int i=0; i<9; i++){
            arr[i] = 1; //1로 초기화
        }
        arr[6] =2; //6은 9로도 사용 가능
    }
}
