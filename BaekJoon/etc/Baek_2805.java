package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2805 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int N = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int high = 0;
		int low = 0;
		st = new StringTokenizer(br.readLine()," ");
		int[] trees = new int[N];
		for (int i = 0; i < trees.length; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			trees[i] = tmp;
			if (high < tmp) high = tmp;
		}
		//이전 값이 더 크면 return

		//적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값
		//잘린 나무의 길이가 length 보다 길면 더 높이 올릴 수 있으므로 mid값 올림
		int result = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if(cutTree(trees, mid) >= length) {
				result = mid;
				low = mid +1;
			} else {
				high = mid-1;
			}
		}

		System.out.println(result);

	}

	public static long cutTree(int[] trees , int mid) {
		long result = 0;
		for(int tree : trees) {
			long cutTree = tree - mid;
			if(cutTree > 0){
				result += cutTree;
			}
		}
		return result;
	}

}
