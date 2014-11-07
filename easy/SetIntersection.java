import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class SetIntersection {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String[] b = a[0].split(",");
			String[] c = a[1].split(",");

			List<String> t = new LinkedList<String>();
			for (int i = 0; i < b.length; i++) {
				t.add(b[i]);
			}
			
			String x = "";
			for (int i = 0; i < c.length; i++) {
				if (t.contains(c[i])) {
					x += c[i];
					if (i < c.length - 1) {
						x += ',';
					}
				}
			}
			System.out.println(x.isEmpty() ? "" : x.endsWith(",") ? x.substring(0, x.length() - 1) : x);
		}
	}

}
