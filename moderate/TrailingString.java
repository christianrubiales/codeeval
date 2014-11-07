import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class TrailingString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			byte r = 0;
			
			if (a[0].length() >= a[1].length()) {
				if (a[0].substring(a[0].length() - a[1].length()).equals(a[1])) {
					r =1;
				}
			}
			
			System.out.println(r);
		}
	}
}
