import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ComparePoints {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int o = s.nextInt();
			int p = s.nextInt();
			int q = s.nextInt();
			int r = s.nextInt();
			
			if (o == q) {
				if (p == r) {
					System.out.println("here");
				} else if (p < r) {
					System.out.println("N");
				} else if (p > r) {
					System.out.println("S");
				}
			} else if (p == r) {
				if (o < q) {
					System.out.println("E");
				} else if (o > q) {
					System.out.println("W");
				}
			} else {
				if (p < r) {
					if (o < q) {
						System.out.println("NE");
					} else if (o > q) {
						System.out.println("NW");
					}
				} else if (p > r) {
					if (o < q) {
						System.out.println("SE");
					} else if (o > q) {
						System.out.println("SW");
					}
				}
			}
		}
	}
}
