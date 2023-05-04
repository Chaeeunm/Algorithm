import java.util.*;
import java.io.*;
 
public class Main{
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long answer = 0;
        int[] section = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        long[] minSection = new long[3];
        Arrays.fill(minSection,Integer.MAX_VALUE);
        minSection[0] = Math.min(section[0],section[5]);
        minSection[1] = Math.min(section[1],section[4]);
        minSection[2] = Math.min(section[2],section[3]);
        Arrays.sort(minSection);
 
        minSection[1] +=minSection[0];
        minSection[2] +=minSection[1];
 
        answer = N==1 ? Arrays.stream(section).sum()-Arrays.stream(section).max().getAsInt() :
                4*minSection[2]+((N-2)*8+4)*minSection[1]+((N-2)*(N-2)*5+4*(N-2))*minSection[0];
        System.out.println(answer);
 
    }
 
}
 