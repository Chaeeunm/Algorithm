package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1003_2 {
	static Integer[] zeroCnt = new Integer[41];
	static Integer[] oneCnt = new Integer[41];
	public static void main(String[] args) throws IOException {
		zeroCnt[0] = 1;
		zeroCnt[1] = 0;
		zeroCnt[2] = 1;
		oneCnt[0] = 0;
		oneCnt[1] = 1;
		oneCnt[2] = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (n -->0) {
			int num = Integer.parseInt(br.readLine());
			sb.append(zeroF(num)).append(" ").append(oneF(num)).append('\n');
		}
		System.out.println(sb);
	}

	public static int zeroF(int n) {
		if(zeroCnt[n] != null){
			return zeroCnt[n];
		} else return zeroCnt[n] = zeroF(n-1) + zeroF(n-2);
	}
	public static int oneF(int n) {
		if(oneCnt[n] != null){
			return oneCnt[n];
		} else return oneCnt[n] = oneF(n-1) + oneF(n-2);
	}
}
