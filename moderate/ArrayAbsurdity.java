import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayAbsurdity {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split(";");
			String[] y = x[1].split(",");
			
			Arrays.sort(y);
			for (int i = 0; i < y.length - 1; i++) {
				if (y[i].equals(y[i+1])) {
					System.out.println(y[i]);
					break;
				}
			}
		}
	}
}
