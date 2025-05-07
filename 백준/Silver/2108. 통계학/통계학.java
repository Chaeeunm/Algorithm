import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
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

    for(int i =0; i<n; i++ ){
      sort[arr[i]+4000]++;
    }
    int freq = 8000;
    int preFreq = -1;
    for(int i = 7999; i>=0; i--) {

      if(sort[freq] < sort[i]) { 
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
    int freqResult = (preFreq != -1&& sort[freq] == sort[preFreq])?preFreq-4000:freq -4000;

    StringBuilder sb = new StringBuilder();
    sb.append(aver).append('\n').append(middle).append('\n').append(freqResult).append('\n').append(range);
    System.out.println(sb);
  }
}
