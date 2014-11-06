

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class AsciiDecryption {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			String[] a = l.split("\\| ");
			String[] b = a[2].split("\\ ");
			int[] s = new int[b.length];
			
			// populate numeric array
			for (int i = 0; i < b.length; i++) {
				s[i] = Integer.parseInt(b[i]);
			}
			
			// check pairs for space and the ending character
			boolean n = false, r = false;
			char h, k;
			int p = 0;
			char e = a[1].trim().charAt(0);
			for (int i = 0; i < s.length - 1; i++) {
				if (r) {
					break;
				}
				for (int j = 0; j < 32; j++) {
					p = j;
					h = (char) (s[i] - p);
					k = (char) (s[i+1] - p);
					if (' ' == k && e == h) {
						r = true;
						break;
					}
					n = !n;
					
					if (j < 32) {
						p *= -1;
						h = (char) (s[i] - p);
						k = (char) (s[i+1] - p);
						if (' ' == k && e == h) {
							r = true;
							break;
						}
						n = !n;
					}
				}
			}
			
			for (int i = 0; i < s.length; i++) {
				h = (char) (s[i] - p);
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
