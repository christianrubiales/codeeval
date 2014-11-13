import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DoubleSquares {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			double m = s.nextDouble();
			
			int p = (int) Math.sqrt(m / 2.0d);
			int t = 0;
			for (int i = 0; i <= p; i++) {
				double j = Math.sqrt(m - (i*i));
				if (j - ((int) j) == 0) {
					t++;
				}
			}
			System.out.println(t);
		}
	}
}
