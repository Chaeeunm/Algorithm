import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();

    long sum =0;

    for (int i =0 ; i< n; i++) {
      //a의 아스키 코드는 97
      long num = s.charAt(i) - 96;
      for(int j =0; j < i; j++){
        num =  (num * 31) % 1234567891;
      }
      sum = (sum + num) % 1234567891;
    }
    System.out.println(sum);
  }
}
