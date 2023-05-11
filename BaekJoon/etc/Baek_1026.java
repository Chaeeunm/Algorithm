package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++){
            B[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); //오름차순
        Arrays.sort(B);

        for(int i =0; i<N; i++){
            sum += A[i] * B[N-1-i];
        }
        System.out.println(sum);
    }
}
