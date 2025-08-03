import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> selected = new ArrayList<>();
	static StringBuilder sb;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		sb = new StringBuilder();

		dfs(1,n,m);
		System.out.println(sb);
	}

	public static void dfs(int start, int n, int m){
		if(m==0) {
			for(int now: selected){
				sb.append(now).append(" ");
			}
			sb.append('\n');
			return;
		}
		for(int i = start; i<=n; i++){
				selected.add(i);
				dfs(i+1, n,m-1);
				selected.remove(selected.size()-1);

		}
	}

}
