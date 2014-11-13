

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringPermutations {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			SortedSet<String> s = new TreeSet<String>();
			p("", l, s);
			
			StringBuffer u = new StringBuffer();
			int c = 0;
			for (String t : s) {
				u.append(t);
				if (c < s.size() - 1) {
					u.append(',');
				}
				c++;
			}
			System.out.println(u.toString());
		}
	}
	
	static void p(String r, String s, Collection<String> c) {
		if (s.isEmpty()) {
			c.add(r);
		} else {
			for (int i = 0; i < s.length(); i++) {
				p(r + s.charAt(i), s.substring(0, i) + s.substring(i+1), c);
			}
		}
	}
}
