import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HappyNumbers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			List<Integer> l = new ArrayList<Integer>();
			
			boolean h = false;
			String t;
			while (true) {
				if (i == 1) {
					h = true;
					break;
				} else if (l.contains(i)) {
					h = false;
					break;
				} else {
					l.add(i);
				}
				t = "" + i;
				int c = 0;
				for (int j = 0; j < t.length(); j++) {
					c += Integer.parseInt("" + t.charAt(j)) * Integer.parseInt("" + t.charAt(j));
				}
				i = c;
			}
			System.out.println(h ? 1 : 0);
		}
	}
}
