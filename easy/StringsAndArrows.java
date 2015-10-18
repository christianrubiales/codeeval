import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StringsAndArrows {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		String l;
		while (s.hasNextLine()) {
			l = s.nextLine();

			int c = 0;
			for (int i = 0; i < l.length(); i++) {
				if (l.charAt(i) == '<') {
					if (i + 4 < l.length()) {
						if (l.charAt(i+1) == '-' && l.charAt(i+2) == '-' && l.charAt(i+3) == '<' && l.charAt(i+4) == '<') {
							c++;
						}
					}
				} else if (l.charAt(i) == '>') {
					if (i + 4 < l.length()) {
						if (l.charAt(i+1) == '>' && l.charAt(i+2) == '-' && l.charAt(i+3) == '-' && l.charAt(i+4) == '>') {
							c++;
						}
					}
				}
			}
			System.out.println(c);
		}
	}
}
