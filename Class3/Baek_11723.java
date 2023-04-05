package Class3;

//all: S를 {1, 2, ..., 20} 으로 바꾼다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//중복이 안된다
//순서는 상관이 없는듯?
//중복을 허용하지 않으므로 Set으로 구현
public class Baek_11723 {
    static HashSet S = new HashSet(20);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case "add":
                    S.add(st.nextToken());
                case "remove":
                    S.remove(st.nextToken());
                case "check":
                    sb.append(check(st.nextToken())).append('\n');
                case "toggle":
                    toggle(st.nextToken());
                case "all":
                    all();
                case "empty":
                    S.clear();
            }

        }
    }
    public static String check(String a){
        return (S.contains(a))?"1":"0";
    }
    public static void toggle(String a){
        if(S.contains(a))S.remove(a); //있으면 제거
        else S.add(a); //없으면 추가
    }
    public static void all() {
        for(int i=1;i<21;i++)
        S.add(i);
    }
}
