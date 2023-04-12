package BaekJoon.Class2;

import java.util.Scanner;

public class Baek_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        int min =63;

        String[] board = new String[row];
        for (int i = 0; i < row; i++) board[i] = sc.nextLine();
        //8x8 크기로 체스판을 잘라줌
        for(int j=0; j<=row-8; j++){
            for(int k=0; k<=col-8; k++){
                String[] cutBoard = new String[8];
                for (int n=0; n<8; n++) cutBoard[n] =board[j+n].substring(k,k+8); //문자열  start위치 부터 end전까지 문자열 발췌
                int bCount = dif(cutBoard);
                //B로 시작하는 체스판 차이수 + W로 시작하는 체스판 차이 =64
                int wCount = 64 - bCount;

                if(bCount<min){
                    min = bCount;
            }
                if(wCount<min) min = wCount;
            }
        }
        System.out.println(min);
    }
    //B로 시작하는 체스판과의 차이를 세는 메서드
    public static int dif(String[] cutBoard) {
        String[] chessBoard = new String[2];
        chessBoard[0] = "BWBWBWBW";
        chessBoard[1] = "WBWBWBWB";
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {//짝수번째 배열일때 (0,2,4,6)
                    if (cutBoard[i].charAt(j) != chessBoard[0].charAt(j)) { //cutBoard의 i번째 배열 String의 j번째 인덱스 !='BWBWBWBW'의 j번째 인덱스
                        count++; //라면 count 1추가
                    }
                }
                else if ((i % 2) != 0) {//홀수번째 배열일때(1,3,5,7)
                    if (cutBoard[i].charAt(j) != chessBoard[1].charAt(j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    }
