import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = calculator(n);

    System.out.println(result);
  }

  public static int calculator(int n) {
    int seasonNum = 0;
    int result = 0;

    for (int i = 666; ; i++) {
      String s = String.valueOf(i);

      if (s.contains("666")) {
        seasonNum++;
      }

      if (seasonNum == n) {
        result = i;
        break;
      }
    }

    return result;
  }
}