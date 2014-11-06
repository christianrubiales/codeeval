import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int i = s.nextInt();
			System.out.println(f(i-1));	
		}
	}
	
	static int f(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0 || n == 1) {
			return 1;
		} else {
			return f(n-1) + f(n-2);
		}
	}
}
