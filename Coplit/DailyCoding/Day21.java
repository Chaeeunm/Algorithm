package Coplit.DailyCoding;
import java.util.*;

public class Day21 {
        public int largestProductOfThree(int[] arr) {

            int maxMul = arr[0]*arr[1]*arr[2];

            for(int i=0; i<arr.length-2; i++){
                int a= arr[i];

                for(int j= i+1; j<arr.length-1; j++){
                    int b = arr[j];

                    for(int k=j+1; k<arr.length; k++){
                        int c= arr[k];
                        int mul = a*b*c;

                        if(mul>maxMul){
                            maxMul =mul;
                        }
                    }
                }
            }
            return maxMul;
        }
    }
