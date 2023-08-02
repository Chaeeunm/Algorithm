import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int max = 0;

        int[] heights = new int[257];
        for(int i=0; i< S; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<G; j++){
                int tmp = Integer.parseInt(st.nextToken());
                heights[tmp]++; //h번째 높이에 더해줌
                min = Math.min(min,tmp); //현재 높이와 최소 높이중 더 작은것에 min저장
                max = Math.max(max,tmp); //최대높이 저장
            }
        }

        int ans = Integer.MAX_VALUE;
        int height = 0;
        for(int i =0; i<=max; i++){
            int currB = B;
            int currAns = 0;
            for(int j=min; j<= max; j++){
                if(j>i){ //최솟값부터 최댓값까지 돌며
                    currAns += heights[j] * ((j-i) * 2);
                    currB += heights[j] * (j -i);
                } else {
                    currAns += heights[j] * (i - j);
                    currB -= heights[j] * (i-j);
                }
            }

            if(currB < 0) continue;;
            if(ans >= currAns){
                ans = currAns;
                height = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans).append(" ").append(height);
        System.out.println(sb);
    }
}
