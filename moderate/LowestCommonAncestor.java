import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LowestCommonAncestor {
	
	static List<String> L = new ArrayList<String>();
	static {
		L.add("30-52");
		L.add("30-8-3");
		L.add("30-8-20");
		L.add("30-8-20-10");
		L.add("30-8-20-29");
	}

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split("\\ ");
			
			String c = null, d = null;
			if (x[0].equals("30") || x[1].equals("30")) {
				c = "30";
			} else {
				for (int i = 0; i < L.size(); i++) {
					if (L.get(i).contains("-" + x[0]) && c == null) {
						c = L.get(i);
					}
					if (L.get(i).contains("-" + x[1]) && d == null) {
						d = L.get(i);
					}
				}
				
				c = c.substring(0, c.lastIndexOf(x[0]) - 1);
				d = d.substring(0, d.lastIndexOf(x[1]) - 1);
				
				int i = Math.min(c.length(), d.length());
				int j = c.length() < d.length() ? c.lastIndexOf('-') : d.lastIndexOf('-');
				j = j < 0 ? 0 : j + 1;
				c = c.substring(j, i);
			}
			System.out.println(c);
		}
	}
}
