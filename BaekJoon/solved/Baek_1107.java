package BaekJoon.solved;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baek_1107 {
    static int cnt = 0;
    //이동 채널
    //고장난 버튼 개수
    //고장난 버튼들0-9 에서 이 수들 뺌
    //버튼 중 가장 가까운 수 찾기(브루투포스)

    //가장 가까운 수 min 초기값 : math.abs(N - 100);
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int to = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int num = remocon(arr, to, 0, to, 0);
        System.out.println(Math.min(Math.abs(to - 100), num));

    }

    //사용하지 말아야 할 수 배열, 가야할 채녈, 반환값
    static int remocon(int[] arr, int to, int val, int min, int cnt) {
        //가야할 채널 자리수+1 == 우리가 얻은 채널 자리수면 반환
        if (cnt == Integer.toString(to).length() + 1) {
            return min + cnt;
        }

        //0~9에서 배열에 잇는 수 빼고 모든 수를 만들어보면서 to-val이 가장작은 수 return
        //리모콘이 해줘야 할 일 ->0~9까지 돌면서 arr에 있는 수면 패스
        min = to;
        Loop1 :
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    break; //다음 반복문으로 넘어감 i++돼서 다시 돌 것
                }
                //그렇지 않다면 to-val의 절댓값의 최솟값을 계속 구해줌 우리가 리턴해야 할거는 최솟값, 가지고 있는건 val값만 있으면 됨
            }
            min = Math.min(min, Math.abs(to - (val * 10 + i)));
            return remocon(arr, to, val * 10 + i, min, cnt++);
        }
        return min+cnt;
    }

}