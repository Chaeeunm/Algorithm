package BaekJoon.etc;

import java.io.IOException;
import java.util.Scanner;

public class Baek_15649 {

	static int n;
	static int m;

	static int[] output;
	static boolean[] visited;

	public static void main (String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		output = new int[m];
		visited = new boolean[n + 1];

		BT(0);
	}

	//숫자
	public static void BT(int depth) {
		if(depth == m) {
			for(int num : output) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		for(int i =1; i <= n ; i++) {
			if(!visited[i]){
				visited[i] = true;
				output[depth] = i;
				BT(depth +1);
				visited[i] = false;
			}
		}
	}
}
