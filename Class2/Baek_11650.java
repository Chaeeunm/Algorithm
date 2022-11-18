package Class2;
/*2차원 평면 위의 점 N개가 주어진다.
좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음
출력하는 프로그램을 작성하시오.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Baek_11650 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][]  = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); //x좌표값 입력
            arr[i][1] = sc.nextInt(); //y좌표값 입력
        }

        Arrays.sort(arr,(a, b)->{ //arr배열을 정력, a,b를 넣었을 때 만약 a와 b의 x좌표가 같다면
            if(a[0] == b[0]) {
                return a[1] - b[1]; //y좌표값 비교?
            }else {
                return a[0] - b[0]; //그렇지 않다면
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}