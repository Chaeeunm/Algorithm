
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팰린드롬수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s =br.readLine();
            if (s.equals("0")) {
                break;
            }
            for (int i = 0; i <=(s.length()/2); i++) {  //나머지 연산자
                if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                    sb.append("no").append('\n');
                    break; //반복문 중지
                }
                else if(i==(s.length()/2)&&s.charAt(i) == s.charAt(s.length()-i-1)){
                    sb.append("yes").append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}