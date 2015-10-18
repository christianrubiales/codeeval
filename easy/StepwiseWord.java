import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StepwiseWord {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		String[] arr;
		while (s.hasNextLine()) {
			arr = s.nextLine().split("\\ ");
			
			// get longest
			int max = 0;
			String longest = null;
			for (String t : arr) {
				if (t.length() > max) {
					max = t.length();
					longest = t;
				}
			}
			
			// print
			StringBuilder u = new StringBuilder();
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < i; j++) {
					u.append('*');
				}
				u.append(longest.charAt(i));
				u.append(' ');
			}
			System.out.println(u.toString());
		}
	}
}
