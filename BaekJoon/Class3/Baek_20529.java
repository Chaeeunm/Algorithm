package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_20529 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        while (tc-->0){
            int M = Integer.parseInt(br.readLine());
            String[] mbti = new String[M];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int i=0;i<M; i++){
                mbti[i] = st.nextToken();
            }
            //3개를 뽑아서 계산한 값에 젤 작은 값 넣어줌
            int count =Integer.MAX_VALUE;
            Loop1 : for(int i=0; i<M-2; i++){
                for(int j=i+1; j<M-1; j++){
                    for(int k=j+1; k<M; k++){
                        String a = mbti[i];
                        String b = mbti[j];
                        String c = mbti[k];
                        count = Math.min(count,count(a,b)+count(b,c)+count(a,c));
                        if(count==0) break Loop1;
                    }
                }
            }

            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    //두개 원소 넣으면 계산
    static int count(String a, String b){
        int count =0;
        for(int i=0;i<4;i++){
            if(a.charAt(i)!=b.charAt(i)) count++;
        }
        return count;
    }
}
