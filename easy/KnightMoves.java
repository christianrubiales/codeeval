import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Tricky with the char and int conversions and less so with getting the proper bounds.
 */
public class KnightMoves {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			
			int c = (char) (l.charAt(0) - 'a'); // column
			int r = (char) (l.charAt(1) - '1'); // row
			c = c > 0 ? c : 0;
			r = r > 0 ? r : 0;
			
			StringBuilder u = new StringBuilder();
			if (c - 2 > -1) {
				if (r - 1 > -1) {
					u.append((char) ('a' + (c - 2))).append((char) ('1' + (r - 1))).append(' ');
				}
				if (r + 1 < 8) {
					u.append((char) ('a' + (c - 2))).append((char) ('1' + (r + 1))).append(' ');
				}
			}
			if (c - 1 > -1) {
				if (r - 2 > -1) {
					u.append((char) ('a' + (c - 1))).append((char) ('1' + (r - 2))).append(' ');
				}
				if (r + 2 < 8) {
					u.append((char) ('a' + (c - 1))).append((char) ('1' + (r + 2))).append(' ');
				}
			}
			if (c + 1 < 8) {
				if (r - 2 > -1) {
					u.append((char) ('a' + (c + 1))).append((char) ('1' + (r - 2))).append(' ');
				}
				if (r + 2 < 8) {
					u.append((char) ('a' + (c + 1))).append((char) ('1' + (r + 2))).append(' ');
				}
			}
			if (c + 2 < 8) {
				if (r - 1 > -1) {
					u.append((char) ('a' + (c + 2))).append((char) ('1' + (r - 1))).append(' ');
				}
				if (r + 1 < 8) {
					u.append((char) ('a' + (c + 2))).append((char) ('1' + (r + 1))).append(' ');
				}
			}
			System.out.println(u.toString().trim());
		}
	}
}
