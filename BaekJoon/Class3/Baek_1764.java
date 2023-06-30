package BaekJoon.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_1764 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //듣도못한사람ㅋ_ㅋ
        int M = Integer.parseInt(st.nextToken()); //보도못한사람ㅎ_ㅎ

        ArrayList<String> 듣보잡 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        HashSet<String> 듣도못한사람 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            듣도못한사람.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            String 보도못한사람 = br.readLine();
            if (듣도못한사람.contains(보도못한사람)) {
                듣보잡.add(보도못한사람);
            }
        }

        Collections.sort(듣보잡);
        sb.append(듣보잡.size()).append('\n');

        for (int i = 0; i < 듣보잡.size(); i++) {
            sb.append(듣보잡.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}
