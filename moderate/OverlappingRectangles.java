

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * The trick is to just consider when they will not overlap:
 * when one box is to the left/right of the other box,
 * or one box is above/below the other box.
 */
public class OverlappingRectangles {

	public static void main(String[] g) throws IOException {
		// read file to list of list of bytes
		Scanner s = new Scanner(new File(g[0]));
		while (s.hasNextLine()) {
			String[] A = s.nextLine().split(",");
			
			int ax1 = Integer.parseInt(A[0]);
			int ay1 = Integer.parseInt(A[1]);
			int ax2 = Integer.parseInt(A[2]);
			int ay2 = Integer.parseInt(A[3]);
			int bx1 = Integer.parseInt(A[4]);
			int by1 = Integer.parseInt(A[5]);
			int bx2 = Integer.parseInt(A[6]);
			int by2 = Integer.parseInt(A[7]);
			
			String r;
			if (ax2 < bx1 || bx2< ax1 || ay2 > by1 || by2 > ay1) {
				r = "False";
			} else {
				r = "True";
			}
			
			System.out.println(r);
		}
	}
}
