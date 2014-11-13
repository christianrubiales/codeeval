import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReverseAndAdd {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			
			int c = 0;
			do {
				i = i + r(i);
				c++;
			} while (!p(i));
			System.out.println(c + " " + i);
		}
	}
	
	static boolean p(int i) {
		String s = Integer.toString(i);
		
		for (int j = 0; j < s.length() / 2; j++) {
			if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
				return false;
			}
		}
		
		return true;
	}
	
	static int r(int i) {
		return Integer.parseInt(new StringBuffer().append(i).reverse().toString());
	}
}
