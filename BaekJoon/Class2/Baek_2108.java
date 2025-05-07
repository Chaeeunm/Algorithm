package BaekJoon.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_2108 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i =0; i< n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);


    int sum = 0;

    for(int i=0; i<n; i++) {
      sum += arr[i];
    }

    int[] sort = new int[8001];

    //-4000 => sort[0] / 0 -> sort[4000] / 4000 -> sort[8000]
    for(int i =0; i<n; i++ ){
      sort[arr[i]+4000]++;
    }
    int freq = 8000;
    int preFreq = -1;
    for(int i = 7999; i>=0; i--) {
      //sort[i] 번재 값 중 가장 큰 값의 index를 담고 겹칠때는
      //중복일 때는 두번째로 작은 값의 인덱스
      if(sort[freq] < sort[i]) { //더 많이 나오는 값이 있으면
        freq = i;
      }
      else if(sort[freq] == sort[i]) {
        preFreq = freq;
        freq =i;
      }
    }

    int aver = (int)Math.round((double)sum / (double)n);
    int middle = arr[n/2];
    int range = arr[n-1] - arr[0];
    //plreFreq에 값이 있으면서 두 값이 값으면
    int freqResult = (preFreq != -1&& sort[freq] == sort[preFreq])?preFreq-4000:freq -4000;

    StringBuilder sb = new StringBuilder();
    sb.append(aver).append('\n').append(middle).append('\n').append(freqResult).append('\n').append(range);
    System.out.println(sb);
  }
}
