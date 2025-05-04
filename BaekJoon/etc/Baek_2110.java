package BaekJoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2110 {
	public static void main(String[] args) throws IOException {
		// 도현이의 집 N개
		//각각의 좌표는 x1...xn
		//C개의 공유기를 N개의 집에 설치할 때 가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램을 작성해라

		//2<=N<=200,000
		//공유기 갯수 2<=C<=N

		//집의 좌표 0<=xn<= 1,000,000,000

		//가장 인접한 두 공유기 사이의 최대 거리를 출력

		// 1 3 5 9 100 정렬 2 2 4 91

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int houseNum = Integer.parseInt(st.nextToken());
		int shareNum = Integer.parseInt(st.nextToken());

		int[] house = new int[houseNum];
		for(int i =0; i< houseNum; i++){
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);
		//2 2 4 9 91
		//집끼리의 차이 배열에 담아줌
		int[] distance = new int[houseNum-1];
		//3 까지 돌며
		//house의 인덱스는 0 1 2 3 4까지 있음
		for(int i =0; i< houseNum-1; i++) {
			distance[i] = house[i+1] - house[i] - 1;
		}

		Arrays.sort(distance);
		//distance = 0 3 4 6
		int result = distance[distance.length-shareNum];
		System.out.println(result);
	}
}
