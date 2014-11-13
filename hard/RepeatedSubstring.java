

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RepeatedSubstring {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l, s;
		while ((l = br.readLine()) != null) {
			String x = "";
			boolean f = false;
			for (int i = l.length(); i > 0; i--) {// length of substring
				if (f) {
					break;
				}
				for (int j = 0; j < l.length() - i; j++) {// starting
					s = l.substring(j, i+j);
					if (l.substring(j+i).contains(s)) {
						x = s;
						f = true;
						break;
					}
				}
			}
			System.out.println(x.trim().isEmpty() ? "NONE" : x);
		}
	}
}
