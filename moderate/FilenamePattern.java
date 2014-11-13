

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilenamePattern {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split("\\ ");
			a[0] = a[0].replace(".", "\\.").replace("*", ".*").replace("?", ".");
			
			StringBuffer u = new StringBuffer();
			for (int i = 1; i < a.length; i++) {
				if (a[i].matches(a[0])) {
					u.append(a[i]).append(' ');
				}
			}
			String s = u.toString().trim();
			System.out.println(s.isEmpty() ? "-" : s);
		}
	}
}
