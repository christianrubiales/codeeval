import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class JugglingWithZeroes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String t = "";
			String[] a = s.split("\\ ");
			boolean f = true, g = true;
			
			for (int i = 0; i< a.length; i++) {
				if (f) {
					g = "00".equals(a[i]);
				} else {
					for (int j = 0; j < a[i].length(); j++) {
						t += g ? "1" : "0";
					}
				}
				f = !f;
			}
			System.out.println(Long.parseLong(t, 2));
		}
	}
}
