

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Spiral Printing
 */
public class SpiralPrinting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
//			System.out.println(l);
			String[] a = l.split(";");
			String[] b = a[2].split("\\ ");
			String[][] M = new String[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
			
			// populate matrix
			int c = 0;
			for (int i = 0; i < M.length; i++) {
				for (int j = 0; j < M[0].length; j++) {
					M[i][j] = b[c];
					c++;
				}
			}
			
			StringBuilder u = new StringBuilder();
			int d = 0, i = 0, j = -1;
			while (c > 0) {
				
				if (d == 0) {// go right
					j++;
					while (j < M[0].length && M[i][j] != null) {
						u.append(M[i][j]).append(" ");
						M[i][j] = null;
						if (j < M[0].length - 1 && M[i][j+1] != null) {
							j++;
						}
						c--;
						if (c == 0) {
							break;
						}
					}
				} else if (d == 1) {// go down
					i++;
					while (i < M.length && M[i][j] != null) {
						u.append(M[i][j]).append(" ");
						M[i][j] = null;
						if (i < M.length - 1 && M[i+1][j] != null) {
							i++;
						}
						c--;
						if (c == 0) {
							break;
						}
					}
				} else if (d == 2) {// go left
					j--;
					while (j > -1 && M[i][j] != null) {
						u.append(M[i][j]).append(" ");
						M[i][j] = null;
						if (j > 0 && M[i][j-1] != null) {
							j--;
						}
						c--;
						if (c == 0) {
							break;
						}
					}
				} else if (d == 3) {// go up
					i--;
					while (i > -1 && M[i][j] != null) {
						u.append(M[i][j]).append(" ");
						M[i][j] = null;
						if (i > 0 && M[i-1][j] != null) {
							i--;
						}
						c--;
						if (c == 0) {
							break;
						}
					}
				}
				
				d = ++d % 4;
			}
			System.out.println(u.toString().trim());
		}
	}
}
