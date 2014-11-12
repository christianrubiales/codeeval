import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class HiddenDigits {
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();

			StringBuffer u = new StringBuffer();
			for (int j = 0; j < i.length(); j++) {
				if (Character.isDigit(i.charAt(j))) {
					u.append(i.charAt(j));
				} if (i.charAt(j) >= 'a' && i.charAt(j) <= 'j') {
					u.append(i.charAt(j) - 'a');
				}
			}
			i = u.toString();
			System.out.println(i.isEmpty() ? "NONE" : i);
		}
	}
}
