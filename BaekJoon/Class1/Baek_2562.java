package BaekJoon.Class1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
//최댓값

public class Baek_2562 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int max =0;
        int maxIndex =0;

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
