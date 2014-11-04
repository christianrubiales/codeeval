import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RollerCoaster {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			
			StringBuffer s = new StringBuffer();
			boolean b = true;
			char c;
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (!b) {
						c = Character.toLowerCase(c);
					} else {
						c = Character.toUpperCase(c);
					}
					b = !b;
				}
				s.append(c);
			}
			System.out.println(s.toString());
		}
	}

}
