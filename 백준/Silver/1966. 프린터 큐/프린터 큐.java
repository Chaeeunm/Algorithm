
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Document {
    int order;
    int importance;

    public Document(int order,int importance){
        this.importance =importance;
        this.order = order;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (tc -->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            Queue<Document> printer = new LinkedList<>();

            //문서의 갯수 N , 몇 번째로 인쇄되었는지 궁금한 순서 M
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] importanceList = new int[N];

            st = new StringTokenizer(br.readLine()," ");
            for(int i =0; i<N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                printer.add(new Document(i,importance));
                importanceList[i] = importance;
            }
            //중요도는 배열에 하나 넣고 오름차순 정렬
            Arrays.sort(importanceList);

            //이제 프린터 안의 문서 중요도랑 비교할것임

            //같으면 빼주고 CNT ++, 이떄 뺴준 친구 순서가 M과 같으면 반복문 탈출
            int cnt = 0;
            int nowIndex = importanceList.length -1;

            while (!printer.isEmpty()){
                Document tmp = printer.poll();

                if(tmp.importance == importanceList[nowIndex]) {
                    cnt++;
                    nowIndex --;
                    if(tmp.order == M) {
                        sb.append(cnt).append('\n');
                        break;
                    }
                }
                //같지 않으면
                else {
                    printer.add(tmp);
                }
            }

            //작으면 넘김

            //CNT 출력

        }
        System.out.println(sb);

    }
}
