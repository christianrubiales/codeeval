import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class TheMajorElement {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			Map<String, Integer> m = new LinkedHashMap<String, Integer>();

			int j;
			for (int i = 0; i < a.length; i++) {
				if (!m.containsKey(a[i])) {
					m.put(a[i], 0);
				}
				j = m.get(a[i]);
				m.put(a[i], ++j);
			}
			j = -1;
			for (String k : m.keySet()) {
				if (m.get(k) > a.length/2) {
					j = Integer.parseInt(k);
					break;
				}
			}
			System.out.println(j > -1 ? j : "None");
		}
	}

}
