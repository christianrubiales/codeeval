import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class BeautifulStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			s = s.toLowerCase();
			char[] a = s.toCharArray();
			Arrays.sort(a);

			// build count-letter pairs
			int t=1, max = 0;
			SortedSet<String> m = new TreeSet<String>();
			char c;
			for (int i = 0; i < a.length; i++) {
				c = a[i];
				if (Character.isAlphabetic(c)) {
					if (i == a.length - 1 || c != a[i+1]) {
						m.add(t+"-"+c);
						max = t > max ? t : max;
						t=1;
					} else {
						t++;
					}
				}
			}
			t=0;
			
			// put in map, ex: 1 = [a, b, c], 2 = [d, e, f]
			SortedMap<Integer, List<Character>> n = new TreeMap<Integer, List<Character>>();
			List<Character> lc;
			for (String x : m) {
				String[] y = x.split("-");
				if (n.containsKey(Integer.parseInt(y[0]))) {
					lc = n.get(Integer.parseInt(y[0]));
				} else {
					lc = new ArrayList<Character>();
					n.put(Integer.parseInt(y[0]), lc);
				}
				lc.add(y[1].charAt(0));
			}
			// reverse the keys
			List<Integer> li = new ArrayList<Integer>(n.keySet());
			Collections.reverse(li);
			
			// populate the alphabet array
			int[] abc = new int[26];
			int ii = 26;
			for (Integer k : li) {
				for (int i=0; i < n.get(k).size(); i++) {
					abc[n.get(k).get(i) - 'a'] = ii;
					ii--;
				}
			}
			// compute the sum
			for (int i =0; i < s.length(); i++) {
				if (Character.isAlphabetic(s.charAt(i))) {
					t += abc[s.charAt(i) - 'a'];
				}
			}
			System.out.println(t);
		}
	}
}
