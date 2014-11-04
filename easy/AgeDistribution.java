import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class AgeDistribution {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
//			System.out.println(i);
			
			String t = null;
			if (i > 100) {
				t = "This program is for humans";
			} else if (i > 65) {
				t = "The Golden Years";
			} else if (i > 22) {
				t = "Working for the man";
			} else if (i > 18) {
				t = "College";
			} else if (i > 14) {
				t = "High school";
			} else if (i > 11) {
				t = "Middle school";
			} else if (i > 4) {
				t = "Elementary school";
			} else if (i > 2) {
				t = "Preschool Maniac";
			} else if (i >= 0) {
				t = "Still in Mama's arms";
			} else {
				t = "This program is for humans";
			}
			System.out.println(t);
		}
	}
}
