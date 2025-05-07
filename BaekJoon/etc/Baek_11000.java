package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_11000 {

	static Lecture[] lectures;
	static boolean[] assigned;
	public static class Lecture {
		Integer start;
		Integer end;

		public Lecture(int start, int end){
			this.start = start;
			this.end = end;
		}
	}
	public static void main(String[] args) throws IOException{


		//si에 시작해서 ti에 끝남
		//끝나는 시간이 빠른 순으로 정렬
		//큐에 넣어서 짬

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		lectures = new Lecture[N];
		assigned = new boolean[N];
		for(int i =0; i<N; i++) {
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			lectures[i] = new Lecture(start, end);
		}

		Arrays.sort(lectures,(a,b) -> Integer.compare(a.end, b.end));
	}
	public static void bfs(Lecture lecture){
		Queue<Lecture> room = new LinkedList<>();

		room.offer(lecture);

		while (!room.isEmpty()){
			//다음 강의를 배정 안했고 다음 강의의 시작 시간이 지금 강의의 종료 시간보다 같거나 크다면
			//큐에 넣고 배정 처리
		}
	}
}
