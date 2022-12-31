package Coplit.DailyCoding;
import java.util.*;
public class Day19 {
        public String decryptCaesarCipher(String str, int secret) {
            StringBuilder result = new StringBuilder(); //생성
            int a;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == ' ') {
                    a =32;
                }
                else {
                    a = (int)str.charAt(i)-secret;
                }
                if(a<97){
                    a= a+26;
                }
                result.append(String.valueOf((char)a));
            }
            return result.toString();

        }
    }
