import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class DetectingCycles {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split("\\ ");
			int[] y = new int[x.length];
			
			for (int i = 0; i < x.length; i++) {
				y[i] = Integer.parseInt(x[i]);
			}
			
			boolean f = false;
			int[] y1, y2;
			for (int i = 1; i < y.length/2; i++) {// length of substring
				if (f) {
					break;
				}
				for (int j = 0; j < y.length - i; j++) {// starting
					y1 = Arrays.copyOfRange(y, j, i+j);
					y2 = Arrays.copyOfRange(y, j+i, y.length);
					if (c(y2, d(y1))) {
						y = y1;
						f = true;
						break;
					}
				}
			}
			
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < y.length; i++) {
				u.append(y[i]);
				if (i < y.length - 1) {
					u.append(' ');
				}
			}
			System.out.println(u.toString());
		}
	}
	
	/**
	 * contains
	 */
	public static boolean c(int[] a, int[] b) {
		boolean c = false;
		
		for (int i = 0; i <= a .length - b.length; i++) {
			int d = 0;
			for (int j = 0; j < b .length; j++) {
				if (a[i+j] == b[j]) {
					d++;
				}
			}
			if (d > 0 && d == b.length) {
				c = true;
				break;
			}
		}
		
		return c;
	}
	
	/**
	 * double the array
	 */
	public static int[] d(int[] a) {
		int[] b = new int[2*a.length];
		for (int i = 0; i < a .length; i++) {
			b[i] = a[i];
			b[a .length + i] = a[i];
		}
		return b;
	}
}
