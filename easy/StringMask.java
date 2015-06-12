import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class StringMask {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String x = s.next();
			String y = s.next();
			
			for (int i = 0; i < x.length(); i++) {
				if (y.charAt(i) == '1') {
					System.out.print(Character.toUpperCase(x.charAt(i)));
				} else {
					System.out.print(x.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
