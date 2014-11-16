import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StringRotation {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split(",");

			String r = "False";
			String t;
			if (x[0].length() == x[1].length()) {
				for (int i = 0; i < x[0].length(); i++) {
					t = x[0].substring(i) + x[0].substring(0, i);
					if (t.equals(x[1])) {
						r = "True";
					}
				}
			}
			System.out.println(r);
		}
	}
}
