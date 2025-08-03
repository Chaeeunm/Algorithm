import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static List<Integer> selected = new ArrayList<>();
	static StringBuilder sb;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		visited = new boolean[n+1];

		sb = new StringBuilder();

		//n까지 돌면서 방문안했으면 depth +1해서 다시 dfs

		dfs(n,m);
		System.out.println(sb);
	}

	public static void dfs(int n, int m){
		if(m==0) {
			for(int now: selected){
				sb.append(now).append(" ");
			}
			sb.append('\n');
			return;
		}
		for(int i=1; i<=n; i++){
			if(!visited[i]){
				visited[i] = true;
				selected.add(i);
				dfs(n,m-1);
				visited[i] = false;
				selected.remove(selected.size()-1);
			}
		}
	}

}
