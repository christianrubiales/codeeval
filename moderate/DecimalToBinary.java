import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DecimalToBinary {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			
			if (l.trim().length() > 0) {
				long i = Long.parseLong(l);
				l = "";
				if (i == 0) {
					l = "0";
				} else {
					while (i > 0) {
						l = (i%2) + l;
						i /= 2;
					}
				}
				System.out.println(l);
			} else {
				System.out.println();
			}
		}
	}
}
