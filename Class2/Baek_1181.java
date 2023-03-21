package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i]=br.readLine();
        }
//길이가 짧은 것부터, 길이가 같으면 사전 순으로 , 중복제거

        Arrays.sort(arr,new Comparator<String>(){

            @Override
            public int compare(String str1,String str2){
                if(str1.length()==str2.length()){ //비교대상 길이가 같으면 사전순 정렬
                    return str1.compareTo(str2);
                }
                else return str1.length() - str2.length(); //다르면 길이가 짧은 것부터 (음수이면 자리바꿈)
            }
        });
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<resultArr.length; i++){
            sb.append(resultArr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
