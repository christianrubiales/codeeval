import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MinimumCoins {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			int j = 0;
			
			while (i >= 5) {
				i -= 5;
				j++;
			}
			while (i >= 3) {
				i -= 3;
				j++;
			}
			while (i >= 1) {
				i -= 1;
				j++;
			}
			
			System.out.println(j);
		}
	}
}
