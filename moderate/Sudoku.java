import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Sudoku {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String[] b = a[1].split(",");
			int c = Integer.parseInt(a[0]); // size of side

			// build the grid
			String[][] e = new String[c][c];
			int f = 0; // counter
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < c; j++) {
					e[i][j] = b[f];
					f++;
				}
			}

			System.out.println(ok(c, e) ? "True" : "False");
		}
	}

	public static boolean ok(int s, String[][] e) {

		Set<String> set;
		// each row must not contain duplicates
		for (int i = 0; i < s; i++) { // current row
			set = new HashSet<String>(s);
			for (int j = 0; j < s; j++) {
				if (set.contains(e[i][j])) {
					return false;
				} else {
					set.add(e[i][j]);
				}
			}
		}

		// each column must not contain duplicates
		for (int i = 0; i < s; i++) { // current column
			set = new HashSet<String>(s);
			for (int j = 0; j < s; j++) {
				if (set.contains(e[j][i])) {
					return false;
				} else {
					set.add(e[j][i]);
				}
			}
		}

		int x = (int) Math.sqrt(s); // size of subgrid side
		
		for (int i = 0; i < x; i++) { // current subgrid "row"
			for (int j = 0; j < x; j++) { // current subgrid "column"
				set = new HashSet<String>(s);
				for (int m = i * x; m < x * (i+1); m++) { // actual row
					for (int n = j * x; n < x * (j+1); n++) { // actual column
						if (set.contains(e[m][n])) {
							return false;
						} else {
							set.add(e[m][n]);
						}
					}
				}
			}
		}
		
		return true;
	}

}
