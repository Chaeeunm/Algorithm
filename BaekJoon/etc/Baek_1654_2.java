package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1654_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] arr = new int[K];
		long max = 0; // 만들 수 있는 최대 길이
//802 743 457 539
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if (max < arr[i]) {
				max = arr[i]; //802
			}
		}

		max++; //803



		//0 1 2 3   / 4 /   5 6 7 8
		long min = 0;
		long mid = 0;
//
		while (min < max) {
			mid = (max + min) / 2; // min : 4
			long count = 0;

			// 중간 길이로 잘라서 총 몇개가 만들어지는지 구하기
			for (int i = 0; i < arr.length; i++) {
				count += arr[i] / mid;
			}

			// 1 2 3 4  /  5 6 7 8
			if (count < N) {
				max = mid;
			}
			else {
				min = mid +1;  //5 6 7 8
			}
		}

		System.out.println(min - 1);
	}

}
