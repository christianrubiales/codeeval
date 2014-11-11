

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DigitStatistics {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] z = l.split("\\ ");
			int a = Integer.parseInt(z[0]);
			long n = Long.parseLong(z[1]);

			Map<String, Integer> m = new HashMap<String, Integer>();
			String s, x;
			int y;
			for (int i = 0; i < n; i++) {
				a *= (i == 0 ? 1 : a);
				s = "" + a;
				x = "" + s.charAt(s.length()-1);
				if (!m.containsKey(x)) {
					m.put(x, 0);
				}
				y = m.get(x);
				m.put(x, ++y);
			}
			
			for (int i = 0; i < 9; i++) {
				System.out.print(i + ": " + (m.containsKey("" + i) ? m.get("" + i) : 0) + ", ");
			}
			System.out.println(9 + ": " + (m.containsKey("" + 9) ? m.get("" + 9) : 0));
		}
	}
}
