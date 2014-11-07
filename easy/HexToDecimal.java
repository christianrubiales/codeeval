import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HexToDecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			int t = 0;
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(s.length() - i - 1);
				if (c == 'a') t += 10 * ((int) Math.pow(16, i));
				else if (c == 'b') t += 11 * ((int) Math.pow(16, i));
				else if (c == 'c') t += 12 * ((int) Math.pow(16, i));
				else if (c == 'd') t += 13 * ((int) Math.pow(16, i));
				else if (c == 'e') t += 14 * ((int) Math.pow(16, i));
				else if (c == 'f') t += 15 * ((int) Math.pow(16, i));
				else t += Integer.parseInt("" + c) * ((int) Math.pow(16, i));
			}
			System.out.println(t);
		}
	}

}
