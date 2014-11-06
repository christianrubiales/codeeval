import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class SumOfIntegersFromFile {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		int i = 0;
		while (s.hasNext()) {
			i += s.nextInt();	
		}
		System.out.println(i);
	}
}
