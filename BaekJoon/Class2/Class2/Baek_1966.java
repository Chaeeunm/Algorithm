// package BaekJoon.Class2.Class2;
//
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Queue;
// import java.util.StringTokenizer;
//
//
// class Docs {
//   int sort;
//   int importance;
//   Docs(int sort, int importance){
//     this.sort = sort;
//     this.importance = importance;
//   }
// }
//
// public class Baek_1966 {
//
//   public static void main(String[] args) throws IOException {
//     //선입 선출
//     //큐의 가장 앞에 있는 문서의 중요도를 확인
//     //나머지 문서 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면 ㅇㅣ 문서를 인쇠하지 않고 젤 뒤에 제배치
//
//
//     //문서의 갯수 (1<=N<=100)
//     //몇번째로 인쇄되었는지 궁금한 문서의 순서(맨 왼쪽은 0번쨰)
//     //중요도는 1이상 9 이하의 정수
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int tc = Integer.parseInt(br.readLine());
//
//     while (tc --> 0) {
//       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//       int num = Integer.parseInt(st.nextToken()); //문서의 갯수
//       int resultSort  = Integer.parseInt(st.nextToken()); //궁금한 문서의 순서
//
//
//       st = new StringTokenizer(br.readLine(), " ");
//
//       Queue<Docs> printer = new LinkedList<>();
//       for(int i =0; i< num; i++) { //1 2 3 4
//         printer.add(new Docs(i,Integer.parseInt(st.nextToken()))); //순서, 중요도 넣어줌
//       }
//
//       //젤 마지막에 넣은거 꺼내서 젤 앞에 넣기
//
//
//       });
//
//
//     }
//
//
//   }
// }
