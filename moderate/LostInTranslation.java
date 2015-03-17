import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LostInTranslation {

	public static void main(String[] a) throws FileNotFoundException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String line = s.nextLine();
			char[] map = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
			
			for (int i = 0; i < line.length(); i++) {
				System.out.print(line.charAt(i) != ' ' ? map[line.charAt(i) - 'a'] : ' ');
			}
			System.out.println();
		}
	}

}
