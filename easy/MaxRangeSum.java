import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MaxRangeSum {
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			String[] b = i.split("\\;");
			String[] c = b[1].trim().split("\\ ");
			int[] d = new int[c.length];
			int ms = 0;
			int n = Integer.parseInt(b[0]);

			for (int j = 0; j < c.length; j++) {
				d[j] = Integer.parseInt(c[j]);
			}
			
			for (int j = 0; j < d.length - n + 1; j++) { // number of slides
				int t = 0;
				for (int k = j; k < j + n; k++) {
					t += d[k];
				}
				ms = t > ms ? t : ms;
			}
			
			System.out.println(ms);
		}
	}
}
