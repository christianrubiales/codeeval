

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringSubstitution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split(";");
			String[] b = a[1].split(",");
			int c = 0, d = 0;
			String x, y;
			
			for (int i = 0; i < b.length; i+=2) {
				x = a[0].substring(0, c);
				y = a[0].substring(c);
				
				if (a[0].substring(0, d).contains(b[i])) {
					x = x.replaceFirst(b[i], b[i+1]);
					c = x.length() + y.indexOf(b[i+1]) + b[i+1].length();
					d = x.indexOf(b[i+1]);
				} else {
					y = y.replaceFirst(b[i], b[i+1]);
					c = x.length() + y.indexOf(b[i+1]) + b[i+1].length();
					d = x.length() + y.indexOf(b[i+1]);
				}
				a[0] = x+y;
				if (c == a[0].length()) {
					c = 0;
					d = 0;
				}
			}
			
			System.out.println(a[0]);
		}
	}
}
