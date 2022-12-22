package Coplit.DailyCoding;
import java.util.*;

public class DC14 {

        public boolean superIncreasing(int[] arr) {
            int sum = 0;
            for(int i=0; i<arr.length-1; i++){
                sum += arr[i];
                if(sum < arr[i+1]) continue;
                else return false;
            }
            return true;
        }
    }
