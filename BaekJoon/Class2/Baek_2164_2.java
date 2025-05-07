package BaekJoon.Class2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_2164_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> cards = new LinkedList<>();

        for(int i=1; i<= N; i++){
            cards.add(i);
        }

        while (cards.size()>=1) {
            if(cards.size() ==1 ){
                System.out.println(cards.poll());
                break;
            }
            else if(cards.size() ==2){
                cards.poll();
            }
            else if(cards.size() >= 3) {
                cards.poll();
                cards.add(cards.poll());
            }
        }
    }
}

