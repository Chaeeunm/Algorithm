package Class2;
//수 정렬하기

import java.io.*;
public class Baek_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean count[] = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N ; i++){
            count[Integer.parseInt(br.readLine())+1000000] = true;
        }
        for(int i=0;i<2000001; i++){
            if(count[i])sb.append(i-1000000).append('\n');
        }
        System.out.println(sb);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int N = Integer.parseInt(br.readLine());
//        for(int i=0; i<N; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        }
//
//        Collections.sort(list); //Array.sort보다 시간복잡도가 빠른 Collection.sort를 사용하여 정렬
//
//        for (int s:list) {
//            sb.append(s).append('\n');
//        }
//        System.out.println(sb);
    }

}
