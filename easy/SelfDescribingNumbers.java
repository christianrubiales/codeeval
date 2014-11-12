import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class SelfDescribingNumbers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.next();
			String[] b = i.split("");
			List<Integer> l = new ArrayList<Integer>();
			
			int c;
			for (int j = 0; j < b.length; j++) {
				try {
					c = Integer.parseInt(b[j]);
					l.add(c);
				} catch (Exception e) {}
			}
			
			boolean o = true;
			for (int j = 0; j < l.size(); j++) {
				int d = 0;
				for (int k = 0; k < l.size(); k++) {
					if (j == l.get(k)) {
						d++;
					}
				}
				if (d != l.get(j)) {
					o = false;
					break;
				}
			}
			
			System.out.println(o ? 1 : 0);
		}
	}
}
