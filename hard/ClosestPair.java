

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Closest Pair - Brute Force
 */
public class ClosestPair {

	public static void main(String[] g) throws IOException {
		// read file to list of list of bytes
		Scanner s = new Scanner(new File(g[0]));
//		while (s.hasNextLine()) {
//			System.out.println(s.nextLine());
//		}
		int t = s.nextInt();
		int[][] P = new int[t][2];
		
		for (int i = 0; i < t; i++) {
			P[i][0] = s.nextInt();
			P[i][1] = s.nextInt();
		}
		
		double min = Double.MAX_VALUE;
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				if (i != j) {
					double d = d(P[i][0], P[i][1], P[j][0], P[j][1]);
					if (d < min) {
						min = d;
					}
				}
			}	
		}
		
		System.out.println(new DecimalFormat("#.####").format(min));
	}
	
	public static double d(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
