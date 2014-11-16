import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
			
			int[] lm = b(y, 1);
			
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < lm[0]; i++) {
				u.append(y[lm[1] + i]).append(' ');
			}
			System.out.println(u.toString().trim());
		}
	}
	
	/**
	 * Brent's cycle-finding algorithm/teleporting turtle
	 * @return int[] where int[0] = lambda, int[1] = mu
	 */
	public static int[] b(int[] a, int x0) {
		int[] lm = new int[]{0,0};
		int p = 1; //power
		lm[0] = p;
		// t = tortoise, h = hare
		int t = x0, h = f(a, x0);
		
		while (t != h) {
			if (p == lm[0]) {
				t = h;
				p *= 2;
				lm[0] = 0;
			}
			h = f(a, h);
			lm[0] = ++lm[0];
		}
		
		lm[1] = 0;
		t = x0;
		h = x0;
		
		for (int i = 0; i < lm[0]; i++) {
			h = f(a, h);
		}

		while (t != h) {
			t = f(a, t);
			h = f(a, h);
			lm[1] = ++lm[1];
		}
		
		return lm;
	}
	
	/**
	 * Floyd's cycle-finding algorithm/tortoise and hare
	 * @return int[] where int[0] = lambda, int[1] = mu
	 */
	public static int[] floyd(int[] a, int x0) {
		int[] lm = new int[]{0,0};
		
		// t = tortoise, h = hare
		int t = f(a, x0), h = f(a, f(a, x0));

		while (t != h) {
			t = f(a, t);
			h = f(a, f(a, h));
		}
		
		lm[1] = 0;
		t = x0;
		while (t != h) {
			t = f(a, t);
			h = f(a, h);
			lm[1] = ++lm[1];
		}
		
		lm[0] = 1;
		h = f(a, t);
		while (t != h) {
			h = f(a, h);
			lm[0] = ++lm[0];
		}
		
		return lm;
	}
	
	public static int f(int[] a, int p) {
		return a[p];
	}
}
