import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CalculateDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		char[] a;
		while ((s = br.readLine()) != null) {
			String t = "";
			boolean b = false, n = false;
			a = s.toCharArray();
			for (int i =0; i< s.length(); i++) {
				if (!b) {
					if (Character.isDigit(a[i])) {
						t += a[i];
					} else if ('-' == a[i]) {
						n = true;
					} else if (',' == a[i]) {
						x1 = Integer.parseInt(t);
						if (n) x1 *= -1;
						t = "";
						n = false;
					} else if (')' == a[i]) {
						y1 = Integer.parseInt(t);
						if (n) y1 *= -1;
						t = "";
						b = true;
						n = false;
					}
				} else {
					if (Character.isDigit(a[i])) {
						t += a[i];
					} else if ('-' == a[i]) {
						n = true;
					} else if (',' == a[i]) {
						x2 = Integer.parseInt(t);
						if (n) x2 *= -1;
						t = "";
						n = false;
					} else if (')' == a[i]) {
						y2 = Integer.parseInt(t);
						if (n) y2 *= -1;
						t = "";
						n = false;
					}
				}
			}
			System.out.println((int) Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))));
		}
	}
}
