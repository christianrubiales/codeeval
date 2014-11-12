import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RacingChars {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		int x = -1, y = -1;
		while ((s = br.readLine()) != null) {
			x = s.indexOf('C');
			if (x > -1) {
				if (y == -1) {
					y = x;
				}
				s = s.replace("C", y == x ? "|" : y > x ? "/" : "\\");
			} else {
				x = s.indexOf('_');
				if (y == -1) {
					y = x;
				}
				s = s.replace("_", y == x ? "|" : y > x ? "/" : "\\");
			}
			y = x;
			System.out.println(s);
			
		}
	}

}
