
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //배열 입력, 다른색이 있다면 4등분 해줌, 그렇지 않다면 0이면 wcount++,1이면 bcount++; => 반복
    static int bCount = 0;
    static int wCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split(" ");
        }
        CountColor(arr, 0, N - 1, 0, N - 1);
        sb.append(wCount).append('\n').append(bCount);
        System.out.println(sb);

    }

    //2차배열의 부분을 돌면서, [i][j]와 같은지 판별,만약 다른 부분이 있다면 또다시 1/4로 나눔
    //그렇지 만약 [i][j] 가 0이면 wcount++; 1이면 bcount++;해줌
    static void CountColor(String[][] arr, int sr, int er, int sc, int ec) {
        if (sc <= ec && sr <= er) {
            int mr = (sr + er) / 2;
            int mc = (sc + ec) / 2;
            String s = arr[sr][sc];
            //배열의 전체를 돌면서 다른 부분이 있다면 또 나눠줌
            if (disColor(arr, sr, er, sc, ec)) {
                CountColor(arr, sr, mr, sc, mc); //왼쪽 위 사각형
                CountColor(arr, mr + 1, er, sc, mc);
                CountColor(arr, sr, mr, mc + 1, ec);
                CountColor(arr, mr + 1, er, mc + 1, ec);//오른쪽 아래 사각형
            } else if (s.equals("0")) wCount++;
            else bCount++;
        }

    }

    //배열 안에 다른 색깔이 있다면 true를 return 그렇지 않다면 false를 리턴하는 함수
    static boolean disColor(String[][] arr, int sr, int er, int sc, int ec) {
        String s = arr[sr][sc];
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                if (!s.equals(arr[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}


