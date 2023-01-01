package Coplit.DailyCoding;
import java.util.*;

public class Day20 {
        public String compressString(String str) {

            if(str.length()==0) return str;

            //스트링빌더 2개생성
            StringBuilder result = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0)+"");

            //for { int i =1 부터 str을 돌며 charAt(i-1)==charAt(i)이면 sb에 append
            for(int i =1; i<str.length(); i++ ){
                if(str.charAt(i-1)==str.charAt(i)) sb.append(str.charAt(i)+"");
                    //같지 않다면
                    //sb의 길이가 0이면 sb.append(charAt(i))
                else if(sb.length()==0) sb.append(str.charAt(i));
                    // sb의 길이가 1이상 2이하면 result.append(sb) sb 비운 후 sb.append(charAt(i))
                else if(sb.length()<=2){
                    result.append(sb.toString());
                    sb.setLength(0); //sb비우기
                    sb.append(str.charAt(i)+"");
                }
                // sb의 길이가 3이상이면 result.append(sb길이+sb첫글자) sb비운 후 sb.append(charAt(i))
                else {
                    result.append(Integer.toString(sb.length())+(sb.charAt(0)+""));
                    sb.setLength(0); //sb비우기
                    sb.append(str.charAt(i)+"");
                }
            }
            // sb의 길이가 1이상 2이하면 result.append(sb)
            if(sb.length()==1||sb.length()==2) result.append(sb);
            // sb의 길이가 3이상이면 result.append(sb길이+sb첫글자)
            if(sb.length()>=3) result.append(Integer.toString(sb.length())+(sb.charAt(0)+""));

            return result.toString();
        }
    }

