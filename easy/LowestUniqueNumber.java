import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class LowestUniqueNumber {
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			String[] e = i.split("\\ ");
			String[] b = i.split("\\ ");
			Arrays.sort(b);
			
			int c = 0, d = 0, m = Integer.MAX_VALUE;
			for (int j = 0; j < b.length - 1; j++) {
				if (b[j].equals(b[j+1])) {
					c++;
				} else {
					d = Integer.parseInt(b[j]);
					if (c == 0 && d < m) {
						m = d;
					}
					c = 0;
				}
			}
			d = Integer.parseInt(b[b.length-1]);
			if (c == 0 && d < m) {
				m = d;
			}
			
			if (m == Integer.MAX_VALUE) {
				System.out.println(0);
			} else {
				for (int j = 0; j < e.length; j++) {
					if (m == Integer.parseInt(e[j])) {
						System.out.println(j+1);
					}
				}
			}
		}
	}
}
