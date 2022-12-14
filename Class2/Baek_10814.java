package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_10814 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            // 입력되는 나이의 범위 : 1 ~ 200
            //stringBuilder 타입이 요소로 들어가는 길이 201의 배열
            StringBuilder[] sort = new StringBuilder[201];

            //객체배열의 인덱스에 각 StringBuilder 객체를 생성해준다.
            for(int i = 0; i < sort.length; i++) {
                sort[i] = new StringBuilder();
            }

            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int age = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                // 카운팅 정렬 : 나이를 index 로 하여 해당 배열에 나이와 이름을 더한다
                //p[21] = 21 김채은 '\n' 21 김코딩 '\n' (같은 나이가 2개 있을 시 들어온 순서대로 입력됨)
                sort[age].append(age).append(' ').append(name).append('\n');
            }

            StringBuilder sb = new StringBuilder();
            for(StringBuilder val : sort) { //p를 돌며 Stringbuilder 타입의 val에 입력받아 더해줌 (빈 객체일시 빈 객체가 더해지므로 무효)
                sb.append(val);
            }
            System.out.println(sb);
        }
    }

