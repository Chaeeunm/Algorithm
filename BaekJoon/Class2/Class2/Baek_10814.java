package BaekJoon.Class2.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] member = new String [n][2];


        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }

        //나이 오름차순
        //나이가 같으면 먼저 가입한 회원 앞에 오기

        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                //숫자의 아스키코드값은 순차적이지 않으니 스트링 타입으로 이루어진 숫자를 비교하고 싶을 떄는
                //정수형으로 변환을 하자!
                //return o1[0].compareTo(o2[0]);
            }
        });
        StringBuilder sb = new StringBuilder();
        Arrays.stream(member).forEach(a -> sb.append(a[0] + " " +  a[1]).append('\n'));
        System.out.println(sb);
        }
    }

