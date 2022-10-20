package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2884 {//2884 알람시계
        public static void main(String[] args)throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int Hour = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());

            if(min>=45){
                min =min-45;
            } else if (min<45&&Hour !=0) {
                Hour=Hour-1;
                min=15+min; //60분-(45분-min)
            } else if (min<45&&Hour==0) {
                Hour=23;
                min=15+min;
            }
            System.out.println(Hour+ " " + min);
        }
    }

