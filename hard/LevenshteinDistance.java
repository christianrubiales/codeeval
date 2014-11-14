

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LevenshteinDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		boolean b = false;
		while ((l = br.readLine()) != null) {
			if (l.equals("END OF INPUT")) {
				b = true;
				continue;
			}
			
			if (b) {
				l2.add(l);
			} else {
				l1.add(l);
			}
		}
		
		for (String h : l1) {
			HashSet<String> m = new HashSet<String>();
			for (String i : l2) {
				if (f(h,i) == 1) {
					m.add(i);
				}
			}
			System.out.println(m.size() + 1);
		}
	}

	/**
	 * Levenshtein distance
	 */
	public static int f(String s, String t) {
		if (s.equals(t)) {
			return 0;
		}
		if (s.isEmpty()) {
			return t.length();
		}
		if (t.isEmpty()) {
			return s.length();
		}
		
		int[] v0 = new int[t.length() + 1];
		int[] v1 = new int[t.length() + 1];
		
		for (int i = 0; i < v0.length; i++) {
			v0[i] = i;
		}

		for (int i = 0; i < s.length(); i++) {
			v1[0] = i + 1;

			for (int j = 0; j < t.length(); j++) {
				int c = s.charAt(i) == t.charAt(j) ? 0 : 1;
				v1[j + 1] = Math.min(v1[j] + 1, v0[j + 1] + 1);
				v1[j + 1] = Math.min(v1[j + 1], v0[j] + c);
			}
			
			for (int j = 0; j < v0.length; j++) {
				v0[j] = v1[j];
			}
		}
		
		return v1[t.length()];
	}
}
