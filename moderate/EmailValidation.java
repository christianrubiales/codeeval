import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class EmailValidation {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			System.out.println(l.trim().length() > 0 ? l.matches("^[a-zA-Z]+[a-zA-Z0-9]*@[a-zA-Z]+[a-zA-Z0-9]*(\\.[a-zA-Z]+)+$") : l);
		}
	}
}
