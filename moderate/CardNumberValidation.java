import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CardNumberValidation {

	public static void main(String[] a) throws FileNotFoundException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String t = s.nextLine().replace(" ", "");
			
			int sum = 0;
			int b = (int) '0'; // base
			int c;
			for (int i = t.length() - 2; i > -1; i -= 2) {
				c = (t.charAt(i) - b) << 1; // double
				if (c > 9) {
					// Compute the sum of the digits
					String d = Integer.toString(c);
					c = (d.charAt(0) - b) + (d.charAt(1) - b); 
				}
				sum += c;
			}
			for (int i = t.length() - 1; i > -1; i -= 2) { // not doubled
				sum += t.charAt(i) - b;
			}
			System.out.println(sum % 10 == 0 ? 1 : 0);
		}
	}

}
