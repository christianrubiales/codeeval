import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Pangrams {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		String[] a = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		while ((s = br.readLine()) != null) {
			String r = "";
			s = s.toLowerCase();
			for (int i = 0; i < a.length; i++) {
				if (!s.contains("" + a[i])) {
					r += a[i]; 
				}
			}
			System.out.println(r.isEmpty() ? "NULL" : r);
		}
	}
}
