import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ArmstrongNumbers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.next();
			
			int c = 0;
			for (int j = 0; j < i.length(); j++) {
				c += Math.pow(Integer.parseInt("" + i.charAt(j)), i.length());
			}
			
			System.out.println(i.equals("" + c) ? "True" : "False");
		}
	}
}
