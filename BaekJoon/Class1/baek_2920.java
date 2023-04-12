package BaekJoon.Class1;

//2920 음계
import java.io.*;

public class baek_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result;
        String s = br.readLine();
        switch (s){
            case "1 2 3 4 5 6 7 8":
                System.out.println("ascending");
                break;
            case "8 7 6 5 4 3 2 1":
                System.out.println("descending");
                break;
            default: //같은 값이 없으면
                System.out.println("mixed");
        }
    }
}

