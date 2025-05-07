package BaekJoon.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1654 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int k = Integer.parseInt(st.nextToken());
		Long n = Long.parseLong(st.nextToken());

		Long[] arr = new Long[k];

		Long sum = 0L;
		for(int i=0; i<k; i++) {
			Long tmp = Long.parseLong(br.readLine());
			arr[i] =tmp;
			sum += tmp;
		}
		Long max = sum / k;

		//우리가 구해야 하는것! 최대랜선길이 : result
		long result =0;

		//가능한 최대랜선길이의 범위 : 1~max
		long left = 1; //1
		long right = max; //8      ///1 2 3   LEFT: 1 RIGHT: 3  / 4 / 5 6 7 8  LEFT : 5 RIGHT : 8
		while (left <=right) { //
			long mid = (left + right) / 2; //mid : 4
			int cnt = 0;
			for (Long length : arr) {
				cnt += length / mid; // 802   743 457 539 : 200  18
			}
			//cnt 값이 n보다 크거나 같다면
			//중간값이 답이거나 중간값보다 더 큰 값이 값일지두?
			//그러니까 중간값을 result에 담아주고 배열의 오른쪽 부분을 다시 탐색해준다
			if (cnt >= n) {
				result = mid; //
				left = mid + 1;
			}
			//그렇지 않으면 더 작은 값중에 답이 있는 것!
			//배열의 왼쪽 부분을 탐색해준다.
			else {
				right = mid - 1;
			}
		}
		System.out.println(result);
	}
}
