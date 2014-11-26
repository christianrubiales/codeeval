import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CashRegister {

	/**
	 * Use integer values instead of floats, so multiply by 100.
	 */
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split(";");
			
			float i = Float.parseFloat(x[0]);
			float j = Float.parseFloat(x[1]);
			
			int[] b = new int[]{10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
			String[] c = new String[]{"ONE HUNDRED","FIFTY","TWENTY","TEN","FIVE","TWO","ONE","HALF DOLLAR","QUARTER","DIME","NICKEL","PENNY"};

			StringBuffer u = new StringBuffer();
			if (i > j) {
				u.append("ERROR");
			} else if (i == j) {
				u.append("ZERO");
			} else {
				 i = j - i;
				 i = Math.round(i * 100);
				int k = 0;
				while (i > 0) {
					while (b[k] <= i) {
						i = i - b[k];
						u.append(c[k]).append(',');
					}
					k++;
				}
			}
			l = u.toString();
			if (l.charAt(l.length() - 1) == ',') {
				l = l.substring(0, l.length() - 1);
			}
			System.out.println(l);
		}
	}
}
