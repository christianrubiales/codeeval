

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LevenshteinDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		Map<String, HashSet<String>> M = null;
		while ((l = br.readLine()) != null) {
			if (M == null) {
				M = new LinkedHashMap<String, HashSet<String>>();
			}
			
			if (l.equals("END OF INPUT")) {
				for (String i : M.keySet()) {
					for (String j : M.keySet()) {
						if (!i.equals(j)) {
							if (f(i,j) == 1) {
								M.get(i).add(j);
								M.get(j).add(i);
							}
						}
					}
				}
				for (String i : M.keySet()) {
					System.out.println(M.get(i).size() + 1);
				}
				M = null;
			} else {
				HashSet<String> s = M.get(l);
				if (s == null) {
					s = new HashSet<String>();
					M.put(l, s);
				}	
			}
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
