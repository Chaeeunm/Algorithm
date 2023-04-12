package BaekJoon.Class1;

import java.io.*;

//2257 단어의개수
public class Baek_2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String D = A*B*C +"";


        int count=0; //0부터 9까지의 수를 세줄 변수
        int arr[] = new int[10]; //count 값을 저장해 줄 배열

        /*i=0부터 9까지 돌며 D.charAt(j)의 값이 i면 count++ */
        for(int i=0; i<10; i++){
            for(int j=0; j<D.length(); j++){
                if(D.charAt(j)-'0' ==i){
                    count++;
                }
            }
            /*한바퀴를 다 돌면 arr[i]에 count값을 저장 후 count값 0으로 초기화해줌*/
            arr[i] = count;
            count=0;
        }
        for(int k=0; k<10; k++){
            bw.write(arr[k]+"\n");//출력
        }
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();//스트림을 닫음
    }
}
