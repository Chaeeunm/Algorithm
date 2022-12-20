package Coplit.DailyCoding;
import java.util.*;

public class Day12 {

        int[] revArray;
        int index =0;

        public int[] reverseArr(int[] arr) {
            if(arr.length==0) return arr;
            if (revArray == null) {
                revArray = new int[arr.length];
            }
            if(revArray[arr.length-1]==arr[0]) return revArray;
            else{
                revArray[index] = arr[arr.length - 1 - index];
                index++;
                return reverseArr(arr);
            }

        }
    }
