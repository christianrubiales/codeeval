import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SwapCase {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			StringBuffer b = new StringBuffer();
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				b.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
			}
			System.out.println(b.toString());
		}
	}
}
