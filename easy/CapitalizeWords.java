import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CapitalizeWords {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			
			String t = "";
			for (int i = 0; i < a.length; i++) {
				t = a[i];
				t = "" + Character.toUpperCase(t.charAt(0));
				if (a[i].length() > 1) {
					t += a[i].substring(1);
				}
				a[i] = t;
			}
			t = "";
			for (int i = 0; i < a.length; i++) {
				t += a[i] + " ";
			}
			System.out.println(t.trim());
		}
	}
}
