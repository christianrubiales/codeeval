import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class GronsfeldCipher {

	public static void main(String[] a) throws IOException {
		Scanner in = new Scanner(new File(a[0]));
		String line;
		
		String alphabet = " !\"#$%&'()*+,-./0123456789:<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		while (in.hasNext()) {
			line = in.nextLine();
			String[] array = line.split(";");
			
			int shift;
			int c = 0;
			for (int i = 0; i < array[1].length(); i++) {
				shift = alphabet.indexOf(array[1].charAt(i));
				shift -= array[0].charAt(c) - '0';
				if (shift < 0) {
					shift = alphabet.length() + shift;
				}
				System.out.print(alphabet.charAt(shift));
				c = ++c % array[0].length();
			}
			System.out.println();
		}
	}

}
