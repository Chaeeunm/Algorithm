package Class2;

import javax.annotation.processing.Generated;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;
public class Baek_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] cards = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] num = new int[M];
        st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());
            //num배열을 돌며 각 숫자가 몇개 들어있는지(upperBound-lowerBound) 확인
                sb.append(upperBound(cards, key) - lowerBound(cards, key)).append(' ');
            }

            System.out.println(sb);
        }
    //key값 '미만'인 수 인덱스 +1 을 찾자!
    public static int lowerBound(int[] arr , int key){
        int low = 0;
        int high = arr.length;

        while(low<high){
            int mid = (low+high)/2;
            //key값이 중간값보다 작거나 같으면 hihg값 내려줌
            if(key<=arr[mid]){
                high = mid;
            }
            else low = mid+1;
        }
        return low;
    }
    public static int upperBound(int[] arr , int key){
        int low = 0;
        int high = arr.length;

        while(low<high){
            int mid = (low+high)/2;
            //key값이 중간값보다 작을떄만 hihg값 내려줌
            if(key<arr[mid]){
                high = mid;
            }
            //그렇지 않으면 (같거나 크면) low값 올려줌
            else low = mid+1;
        }
        //low값 리턴
        return low;
    }
}

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        /*
//         *  HashMap<Key, Value>
//         *  Key = 입력되는 원소
//         *  Value = 원소의 개수(=중복 입력 된 원소의 수)
//         */
//
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        for(int i = 0; i < N; i++) {
//            int key = Integer.parseInt(st.nextToken());
//
//            /*
//             * getOrDefault(key, defaultValue)
//             * key에 대해 map에 저장 된 value를 반환한다.
//             * 만약 value가 없을 경우 defaultValue값을 반환한다.
//             */
//            map.put(key, map.getOrDefault(key, 0) + 1);
//        }
//
//        int M = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        st = new StringTokenizer(br.readLine(), " ");
//        for(int i = 0; i < M; i++) {
//            int key = Integer.parseInt(st.nextToken());
//
//            sb.append(map.getOrDefault(key, 0)).append(' ');
//        }
//
//        System.out.println(sb);
//    }
//}
//
//
