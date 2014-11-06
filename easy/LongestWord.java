import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class LongestWord {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			int max = -1;
			String w = null;
			for (int i = 0; i < a.length; i++) {
				if (a[i].length() > max) {
					max = a[i].length();
					w = a[i];
				}
			}
			System.out.println(w);
		}
	}
}
