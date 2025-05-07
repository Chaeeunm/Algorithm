package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baek_1744 {
	public static void main(String[] args) throws IOException {

		//1은 안묶는게 좋음
		//2 이상의 양수일때 오름차순으로 정렬해서 큰수끼리 묶음
		//음수일때 음수가 짝수개면 오름차순 정렬해서 절대값 큰수부터 묶음
		//음수가 홀수개면 오름차순 정렬해서 절대값 큰수부터 묶은 후 남는수 한개는 0과 연결

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int oneCnt =0;
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>(); //0까지 여기 넣음

		long result = 0;
		while (n -->0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());

			if(num>1) {
				pos.add(num);
			}
			else if(num ==1) {
				oneCnt++;
			}
			else {
				neg.add(num);
			}
		}

		Collections.sort(pos); //오름차순 정렬(절댓값 큰수가 뒤에)
		Collections.sort(neg, (a,b) -> Integer.compare(b,a)); //내림차순 정렬(절대값 큰수가 뒤에)

		int i = 0;//짝수면 0부터 시작
		if(pos.size() % 2 == 1){
			i = 1;//홀수면 1부터 시작
			result += pos.get(0);
		}
		while(i + 1 < pos.size()) {
			result += pos.get(i) * pos.get(i+1);
			i += 2;
		}

		int j = 0; //짝수면 처음부터 시작
		if(neg.size() % 2 ==1) {
			j = 1; //홀수면 절댓값 젤 작은수 냅둠(0도 가능)
			result += neg.get(0);
		}
		while (j + 1 < neg.size()){
			result += neg.get(j) * neg.get(j+1);
			j += 2;
		}

		result += oneCnt;
		System.out.println(result);
	}
}
