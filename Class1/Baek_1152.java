package Class1;
import java.util.*;
import java.io.*;

public class Baek_1152 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine().trim();

            /*공백을 기준으로 나누어 배열에 입력*/
            String arr[] = s.split(" ");
            if (s.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(arr.length);
            }
        }
    }
