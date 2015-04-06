import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;


public class BurrowsWheelerTransform {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			// init
			String l = s.nextLine();
			char[] A = l.toCharArray();
			String[] S = new String[A.length]; 
			for (int i = 0; i < A.length; i++) {
				S[i] = new String("".getBytes(), Charset.forName("US-ASCII"));
			}
			
			for (int i = 0; i < A.length; i++) {
				Arrays.sort(S);
				add(A, S);
			}
			for (int i = 0; i < S.length; i++) {
				if (S[i].charAt(0) == '$' && S[i].charAt(S[i].length() - 1) == '$') {
					l = S[i].substring(1);
					break;
				}
			}
			
			System.out.println(l);
			
		}
	}

	public static void add(char[] A, String[] S) {
		for (int i = 0; i < A.length; i++) {
			S[i] = A[i] + S[i];
		}
	}
	
}
