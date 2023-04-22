import java.util.Scanner;

//2292 벌집
public class Main {
    public static void main(String[] args) {
    /*
    규칙
    1- 1개방 지남 (1)
    2-7 2개방 지남 (+6)
    8-19 3개방 지남 (+12)
    20-37 4개방 지남 (+18)
    38-61 5개방 지남 (+24)
    */
        Scanner in = new Scanner(System.in); //scanner 객체 생성
        int N = in.nextInt();
        int passRoomCount = 1;
        int range = 2;
        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * passRoomCount);
                passRoomCount++;
            }
            System.out.print(passRoomCount);
        }
    }
}