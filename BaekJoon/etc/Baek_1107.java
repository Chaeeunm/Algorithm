package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1107 {

    static int[] arr;

    //가장 가까운 수 min 초기값 : math.abs(N - 100);
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] buttons = new int[10];
        int to = Integer.parseInt(br.readLine()); //가야할 채널
        int n = Integer.parseInt(br.readLine()); //고장난 채널 수
        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(x -> buttons[x] = 1);

        int result = remocon(to,Math.abs(to-100),0);
        System.out.println(result);
    }

    //to.length()+1~ to.length() -1 까지 만들 수 있는 모든 수
    //
    static int remocon(int to, int min, int from) { //만든 채널
        int l = String.valueOf(to).length();
        int cl = String.valueOf(from).length();
        if (cl - l == 1) return min; //to의 자릿수+1d일때까지 값을 구해줄거임
        else {
            for (int i = 0; i < 10; i++) {
                boolean c = false; //c는 false로 초기화
                //배열에 없는 수라면 진행
                for (int j : arr) {
                    if (i == j) {
                        c = true;
                        break;
                    }
                }
                if(!c){ //만약 배열에 없는 수라면
//                    from += i;
//                    min = Math.min(min, Math.abs(to - from)+cl); //min = to -from(이동해야 할 수) + cl from을 누르기 위해 필요한 클릭수
//                    return remocon(to, min, from * 10);
                    int nextFrom = from * 10 + i;
                    min = Math.min(min, Math.abs(to - nextFrom) + cl + 1);
                    min = remocon(to, min, nextFrom);
                }
            }
        }
        return min;
    }
}