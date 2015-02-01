import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Locks {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			int j = s.nextInt();
			int c = 0;
			
			if (j % 2 == 0) { // multiples of 6 unlocked
//				for (int x = 1; x <= i; x++) {
//					if (x % 6 == 0) {
//						c++;
//					}
//				}
				c = i/2;
			} else {
				for (int x = 1; x <= i; x++) {
					if (x % 6 != 0) { // 2-multiples and 3-multiples unlocked, but not 6-multiples
						if (x % 2 == 0 || x % 3 == 0) {
							c++;
						}
					}
				}
			}
			System.out.println(c);
		}
	}
}
