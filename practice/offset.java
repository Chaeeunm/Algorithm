package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class offset {
    public static void main(String[] args) throws IOException {
        String[][] strs = new String[5][5];

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<5; i++){
            strs[i] = br.readLine().split(" ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(offset(i,j,strs)).append(" ");
            }
            sb.append('\n');
            }
        System.out.println(sb);
    }
    static String offset(int i,int j, String[][] strs) {
                int num = Integer.parseInt(strs[i][j]);
                switch (i) {
                    case 0:
                        if (num < Integer.parseInt(strs[i + 1][j])) return offsetJ(num,i,j,strs);
                        break;
                    case 1, 2, 3:
                        if (num < Integer.parseInt(strs[i - 1][j]) && num < Integer.parseInt(strs[i + 1][j]))
                            return offsetJ(num, i,j,strs);
                        break;
                    case 4:
                        if (num < Integer.parseInt(strs[i - 1][j])) return offsetJ(num,i,j,strs);
                        break;
        }
        return strs[i][j];
        }

        static String offsetJ(int num, int i,int j, String[][]strs ){
            switch (j){
                case 0 : if(num<Integer.parseInt(strs[i][j+1])) return "*";
                    break;
                case 1,2,3: if(num<Integer.parseInt(strs[i][j-1]) && num<Integer.parseInt(strs[i][j+1])) return "*";
                    break;
                case  4 : if(num<Integer.parseInt(strs[i][j-1])) return "*";
                    break;
            }
            return strs[i][j];
        }
    }

