import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Locks {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int N = s.nextInt();
			int M = s.nextInt();
			
			boolean[] b = new boolean[N];
			
			for (int i = 0; i < M - 1; i++) {
				for (int j = 1; j < N; j += 2) {
					b[j] = true;	
				}
				for (int j = 2; j < N; j += 3) {
					b[j] = !b[j];	
				}
			}

			b[N-1] = !b[N-1]; // last iteration

			int c = 0; // count
			for (int i = 0; i < N; i++) {
				c += b[i] ? 0 : 1;
			}
			
			System.out.println(c);
		}
	}
}
