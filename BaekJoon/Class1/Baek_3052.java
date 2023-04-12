package BaekJoon.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//3052 나머지
public class Baek_3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputArr[] = new int[10]; //입력값을 담아줄 배열 생성
        int reminderArr[] =new int[10];//나머지를 담아줄 배열

        for (int i = 0; i < 10; i++) {
           int input = Integer.parseInt(br.readLine());
            inputArr[i] = input;
        }
        for(int j =0; j<10; j++){
            reminderArr[j] = inputArr[j] % 42; //나머지배열에 입력값 을 42로 나눈 나머지 값을 넣어줌
        }
        /*Stream 사용하여 배열중복제거*/
        int[] resultArr = Arrays.stream(reminderArr).distinct().toArray();

        System.out.println(resultArr.length);
    }
}
