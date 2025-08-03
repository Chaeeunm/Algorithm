import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	//길이가 짧은것부타,
	//길이가 짧으면 사전순
	//중복단어 제거

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		//내부적으로 이진탐색 트리 사용 O(log N) 따라서 저장다한담에 정렬하는거랑 속도는 같음
		Set<String> set = new TreeSet<>((a,b) -> {
			if(a.length() == b.length()) return a.compareTo(b);
			else return a.length() - b.length();
		});

		while (N-->0){
			set.add(br.readLine());
		}


		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(String now : set){
			bw.write(now);
			bw.newLine();
		}
		bw.flush();
	}

}
