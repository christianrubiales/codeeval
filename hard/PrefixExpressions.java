

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class PrefixExpressions {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split("\\ ");
			
			LinkedList<String> s = new LinkedList<String>();
			int c = 0;
			double x,  y;
			String o;
			for (int i = 0; i < a.length; i++) {
				if ("+".equals(a[i]) || "*".equals(a[i]) || "/".equals(a[i])) {
					s.push(a[i]);
				} else {
					s.push(a[i]);
					c++;
					if (c == 2) {
						y = Double.parseDouble(s.pop());
						x = Double.parseDouble(s.pop());
						o = s.pop();
						
						if ("+".equals(o)) {
							s.push("" + (x+y));
						} else if ("*".equals(o)) {
							s.push("" + (x*y));
						} else if ("/".equals(o)) {
							s.push("" + (x/y));
						}
						
						c = 1;
					}
				}
			}
			System.out.println(Math.round(Double.parseDouble(s.getFirst())));
		}
	}
}
