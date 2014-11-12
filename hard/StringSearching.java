

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringSearching {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split(",");
			a[1] = a[1].replace("*", ".*").replace("\\", ".").replace("..*", ".*").replace(".*.*", ".*");
			System.out.println(a[0].matches(".*" + a[1] + ".*"));
		}
	}
}
