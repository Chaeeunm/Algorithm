package Class2;
//수 정렬하기

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용.
 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘인 것은 맞으나 최악의 경우 시간복잡도는 O(n2)임!!
 => 최악의 경우에도 O(nlogn) 을 보장하거나 혹은, O(n) 에 가까운 정렬 알고리즘을 사용해야 한다

<2가지 방법>

1.Collections.sort()  => 합병 및 삽입정렬 알고리즘을 사용
    합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고. 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다
    대신에 Collections.sort()를 사용하고자 한다면 일반적인 primitive 배열이 아닌 List 계열(ArrayList, LinkedList 등..)의 자료구조를 사용하여 정렬해야한다.


2.Counting sort (카운팅 정렬)을 응용

*/
public class Baek_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list); //Array.sort보다 시간복잡도가 빠른 Collection.sort를 사용하여 정렬

        for (int s:list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
