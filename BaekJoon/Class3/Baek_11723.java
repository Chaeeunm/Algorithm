package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
//중복이 안된다
//순서는 상관이 없는듯?
//중복을 허용하지 않으므로 Set으로 구현
public class Baek_11723 {
    static HashSet<Integer> S = new HashSet(20);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case "add":
                    S.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    S.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(check(Integer.parseInt(st.nextToken()))).append("\n");
                    break;
                case "toggle":
                    toggle(Integer.parseInt(st.nextToken()));
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    S.clear();
                    break;
            }
        }
        System.out.println(sb);

    }
    public static String check(int num){
        return (S.contains(num))?"1":"0";
    }
    public static void toggle(int num){
        if(S.contains(num))S.remove(num); //있으면 제거
        else S.add(num); //없으면 추가
    }
    public static void all() {
        for(int i=1;i<21;i++)
        S.add(i);
    }
}

//객체로 해서 String으로 받았을 때랑 Integer로 받았을 때랑 값이 달라짐 왜일까?

