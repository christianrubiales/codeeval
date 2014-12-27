import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class WithoutRepetition {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String str = s.nextLine();
			
			StringBuilder u = new StringBuilder();
			char p = '\u0000';
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != p) {
					u.append(str.charAt(i));
				}
				p = str.charAt(i);
			}
			
			System.out.println(u.toString());
		}
	}
}
