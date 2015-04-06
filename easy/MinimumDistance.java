import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MinimumDistance {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(args[0]));
		while (in.hasNext()) {
			int F = in.nextInt();
			int[] A = new int[F];
			for (int i = 0; i < F; i++) {
				A[i] = in.nextInt();
			}
			Arrays.sort(A);
			
			int min = Integer.MAX_VALUE;
			int t; 
			for (int i = A[0]; i < A[A.length - 1]; i++) {
				t = getDistance(A, i);
				if (t < min) {
					min = t;
				}
			}
			System.out.println(min);
		}
	}
	
	public static int getDistance(int[] A, int i) {
		int d = 0;
		
		for (int a : A) {
			d += Math.abs(a - i);
		}
		
		return d;
	}

}
