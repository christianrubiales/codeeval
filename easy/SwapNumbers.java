import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class SwapNumbers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		String l;
		String[] r;
		char[] c;
		while (s.hasNext()) {
			l = s.nextLine();
			r = l.split(" ");
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < r.length; i++) {
				c = r[i].toCharArray();
				char t = c[0];
				c[0] = c[c.length - 1];
				c[c.length - 1] = t;
				u.append(c);
				if (i < r.length - 1) {
					u.append(" ");
				}
			}
			System.out.println(u.toString());
		}
	}
}
