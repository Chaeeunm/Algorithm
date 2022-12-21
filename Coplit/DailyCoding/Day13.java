package Coplit.DailyCoding;
import java.util.*;

public class Day13 {

        public static String readVertically(String[] arr) throws StringIndexOutOfBoundsException{
            // TODO:
            //sb사용
            StringBuilder result = new StringBuilder();
            int longestStringLength = 0;
            //배열을 돌며 가장 긴 문자열의 길이를 저장한 후i++
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > longestStringLength)
                    longestStringLength = arr[i].length();
            }
            //가장 긴 문자열의 길이만큼 반복j++
            for (int j = 0; j < longestStringLength; j++) {
                //배열의 총 길이만큼 sb.append(arr[k].charAt(j))
                for (int k = 0; k < arr.length; k++) {
                    if(arr[k].length()<j+1) continue;
                    else result.append(arr[k].charAt(j));
                }
            }
            return result.toString();
        }
    }

