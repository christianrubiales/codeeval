import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class OneZeroTwoZeros {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextInt()) {
			Integer x = s.nextInt();
			Integer r = s.nextInt();
			int total = 0;
			
			for (int i = 1; i <= r; i++) {
				String str = Integer.toBinaryString(i);
				int c = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '0') {
						c++;
					}
				}
				if (c == x) {
					total++;
				}
			}
			System.out.println(total);
		}
	}
}
