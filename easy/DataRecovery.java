import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedMap;
import java.util.TreeMap;


public class DataRecovery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] a = line.split(";");
			String[] b = a[0].split("\\ ");
			String[] c = a[1].split("\\ ");
			boolean[] d = new boolean[b.length+1];
			
			SortedMap<Integer, String> m = new TreeMap<Integer, String>();
			int t;
			for (int i = 0; i  < c.length; i++) {
				t = Integer.valueOf(c[i]);
				m.put(t, b[i]);
				d[t] = true;
			}

			t = 0;
			for (int i = 1; i <= b.length; i++) {
				if (!d[i]) {
					m.put(i, b[c.length+t]);
					t++;
				}
			}
			
			StringBuffer s = new StringBuffer();
			for (Integer i : m.keySet()) {
				s.append(m.get(i)).append(" ");
			}
			System.out.println(s.toString().trim());
		}

	}

}
