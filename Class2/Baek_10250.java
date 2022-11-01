package Class2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //input[0]호텔의 층 수, input[1]각 층의 방 수, input[3]몇 번째 손님
            /*arr[2]%arr[0] = 손님이 묵을 층 수가 됨. 단, 나머지가 0이면 층수 = arr[0]*/
            /*손님이 묵을 방 번호 수 -> (arr[2]/arr[0])+1. 단, 나머지가 0이면 arr[2]/arr[0]이 호수가 됨*/
            int floor;
            int lastNum;
            if(input[2]%input[0]==0) {
                floor=input[0];
                lastNum = input[2]/input[0];
            }
            else {
                floor = input[2] % input[0];
                lastNum = input[2] / input[0] + 1;
            }
            /* 손님이 묵을 호수 = 층수 *100 + 방번호*/
            sb.append(floor *100 + lastNum).append('\n');
        }
        System.out.println(sb);
    }
}
