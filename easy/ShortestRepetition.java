import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ShortestRepetition {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			int m = 0;
			for (int i = 1; i < s.length(); i++) {
				String t = "", b = "";
				b = s.substring(0, i);
				
				while (t.length() < s.length()) {
					t += b;
				}
				if (t.equals(s)) {
					m = b.length();
					System.out.println(m);
					break;
				}
			}
			if (m == 0) {
				System.out.println(s.length());
			}
		}
	}

}
