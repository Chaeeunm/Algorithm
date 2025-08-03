import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	//길이가 짧은것부타,
	//길이가 짧으면 사전순
	//중복단어 제거

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();

		while (N-->0){
			set.add(br.readLine());
		}

		List<String> sorted = set.stream().sorted((a,b) -> {
			if( a.length() == b.length()){
				return a.compareTo(b);
			} else return a.length() - b.length();
		}).collect(Collectors.toList());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(String now : sorted){
			bw.write(now);
			bw.newLine();
		}
		bw.flush();
	}

}
