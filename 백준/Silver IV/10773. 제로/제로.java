
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> jb = new Stack<>();
        while (n-->0) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp != 0) jb.add(tmp);
            else jb.pop();
        }
        int result =0;
        while (!jb.isEmpty()){
            result += jb.pop();
        }
        System.out.println(result);
    }
}
