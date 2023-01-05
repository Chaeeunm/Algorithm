package Coplit.DailyCoding;
import java.util.*;

public class Day23 {
        ArrayList<Integer> memo = new ArrayList<>();
        public int fibonacci(int num) {
            memo.add(0);
            memo.add(1);
            return fibo(memo,num);
        }
        public int fibo(ArrayList<Integer> memo, int num){
            if(memo.size() <= num){
                memo.add(fibo(memo,num-1)+fibo(memo,num-2));
            }
            return memo.get(num);
        }

    }
