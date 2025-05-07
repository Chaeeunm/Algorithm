package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        while (N-->0) {
            int num = Integer.parseInt(br.readLine());
            arr[num] ++; //NUM번째 인덱스를 하나씩 올려줌[0 2 2 2 1 2 0 1 0 ...]
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                for(int j =0; j < arr[i]; j++) {
                    sb.append(i).append('\n');
                }
            }
        }
        System.out.println(sb);

    }
}
