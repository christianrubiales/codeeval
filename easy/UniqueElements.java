import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;


public class UniqueElements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			
			Set<String> t = new LinkedHashSet<String>();
			for (String c : a) {
				t.add(c);
			}
			String x = "";
			for (String c : t) {
				x += c + ",";
			}
			System.out.println(x.substring(0, x.length() - 1));
		}
	}
}
