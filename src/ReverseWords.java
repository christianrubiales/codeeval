import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReverseWords {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] a = line.split("\\ ");
			StringBuffer s = new StringBuffer();
			for (byte i = (byte) (a.length - 1); i >= 0; i--) {
				s.append(a[i]).append(" ");
			}
			System.out.println(s.toString().trim());
		}
	}

}
