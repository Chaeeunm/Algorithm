import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int left =0;
        int ans =0;

        for(int i=0; i< s.length(); i++){
            //만약 (이면서 다음이 )이 아니면 left에 1을 더함
            if(s.charAt(i)=='('&&s.charAt(i+1)!=')'){
                left++;
            }
            //만약 (이면서 다음이 )이면 ans에 left를 더하고 i++
            else if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
                ans += left;
                i++;
            }
            //만약 )이면 ans에 1을 더하고 left에 1을 뺌
            else {
                ans++;
                left--;
            }
        }
        System.out.println(ans);
    }
}
