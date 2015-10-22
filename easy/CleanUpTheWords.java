import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CleanUpTheWords {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			char[] arr = s.nextLine().toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (!Character.isAlphabetic(arr[i])) {
					arr[i] = ' ';
				} else {
					arr[i] = Character.toLowerCase(arr[i]);
				}
			}
			String r = new String(arr);
			r = r.trim().replaceAll("\\s+", " ");
			System.out.println(r);
		}
	}
}
