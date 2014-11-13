

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class DistinctSubsequences {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split(",");
			
			System.out.println(d(a[0], a[1]));
		}
	}
	
	/**
	 * dynamic programming
	 */
	static int d(String s, String t) {
		int[][] b = new int[s.length()+1][t.length()+1];
		
		for (int i = 0; i < s.length(); i++) {
			b[i][0] = 1;
		}
		
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					b[i][j] += b[i - 1][j] + b[i - 1][j - 1];
				} else {
					b[i][j] += b[i - 1][j];
				}
			}
		}
		
		return b[s.length()][t.length()];
	}
}
