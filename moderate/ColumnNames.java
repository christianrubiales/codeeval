import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ColumnNames {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			
			StringBuilder u = new StringBuilder();
			while (i > 0) {
				i--;
				u.append((char) (i % 26 + 'A'));
				i /= 26;
			}
			
			System.out.println(u.reverse().toString());
		}
	}
}
