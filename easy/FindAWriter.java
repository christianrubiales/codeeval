import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FindAWriter {
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			String[] b = i.split("\\|");
			String[] c = b[1].trim().split("\\ ");
			
			StringBuffer u = new StringBuffer();
			for (int j = 0; j < c.length; j++) {
				u.append(b[0].charAt(Integer.parseInt(c[j]) - 1));
			}
			System.out.println(u.toString());
		}
	}
}
