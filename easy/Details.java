import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Details {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] R = l.split("\\,"); // rows
			int m = Integer.MAX_VALUE; // min
			
			int t;
			for (String r : R) {
				t = r.indexOf('Y') - r.lastIndexOf('X') - 1;
				if (t < m) {
					m = t;
				}
			}
			System.out.println(m);
		}
	}
}
