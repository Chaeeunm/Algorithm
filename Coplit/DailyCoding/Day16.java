package Coplit.DailyCoding;
import java.util.*;

public class Day16 {
    public boolean isIsogram(String str) {
            if (str.length()==0) return true;
            String s= str.toUpperCase();
            for(int i=0; i<s.length(); i++){
                for(int j= i+1; j<s.length(); j++){
                    if(s.charAt(i)==s.charAt(j)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

