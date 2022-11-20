package Class2;
import java.util.*;

public class Baek_11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>(); //결과 ArrayList

        //q에 N까지 채워넣음
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        //q에서 K-1만큼 poll해서 맨 위에 다시 add해줌
        //K번째 수는 poll해서 result 에 넣음
        while (q.size() > 0) {

            for (int j = 1; j <= K; j++) {
                if (j == K) { //K번째 수일때 result에 추가
                    result.add(q.poll());
                }
                else q.add(q.poll()); //그렇지 않다면 첫번째 값 뒤로 보내기
            }
        }
        System.out.println(result.toString().replace("[","<").replace("]",">"));
    }

}
