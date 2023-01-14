package Coplit.DailyCoding;
import java.util.ArrayList;

public class DC24 {
        public boolean isSubsetOf(int[] base, int[] sample) {
            ArrayList<Integer> baseCheck = new ArrayList<>();
            for(int temp : base){
                baseCheck.add(temp);
            }

            int j=sample.length;
            for(int i=0; i<sample.length; i++){
                if(baseCheck.contains(sample[i])){
                    j--;
                }
                if(j==0)return true;
            }
            return false;
        }
    }

