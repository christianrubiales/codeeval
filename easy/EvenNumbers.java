import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class EvenNumbers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			System.out.println(i%2==0 ? "1" : "0");
		}
	}
}
