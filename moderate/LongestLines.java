import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;



public class LongestLines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		int x = Integer.parseInt(br.readLine());
		SortedMap<Integer, List<String>> m = new TreeMap<Integer, List<String>>();
		String s;
		while ((s = br.readLine()) != null) {
			List<String> t = m.get(s.length());
			if (t == null) {
				t = new LinkedList<String>();
			}
			t.add(s);
			m.put(s.length(), t);
		}

		int y = m.size() - 1;
		int z = 0;
		for (int i = y; i >= 0; i--) {
			Integer k = m.lastKey();
			List<String> t = m.get(k);
			m.remove(k);
			for (int j = 0; j < t.size(); j++) {
				System.out.println(t.get(j));
				z++;
				if (z >= x) {
					return;
				}
			}
		}
	}
}
