

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestCommonSubsequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split(";");
			
			System.out.println(d(a[0], a[1]));
		}
	}
	
	/**
	 * dynamic programming
	 */
	static String d(String s, String t) {
		int[][] b = new int[s.length()+1][t.length()+1];
		
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = t.length() - 1; j >= 0; j--) {
				if (s.charAt(i) == t.charAt(j)) {
					b[i][j] = b[i+1][j+1] + 1;
				} else {
					b[i][j] = Math.max(b[i+1][j], b[i][j+1]);
				}
			}
		}
		
		int i = 0, j = 0;
		StringBuffer u = new StringBuffer();
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				u.append(s.charAt(i));
				i++;
				j++;
			} else if (b[i+1][j] >= b[i][j+1]) {
				i++;
			} else {
				j++;
			}
		}
		
		return u.toString();
	}
}
