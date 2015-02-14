

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSubMatrix {

	public static void main(String[] g) throws IOException {
		// read file to list of list of bytes
		Scanner s = new Scanner(new File(g[0]));
		List<List<Byte>> M = new ArrayList<List<Byte>>();
		String l;
		while (s.hasNextLine()) {
			Scanner t = new Scanner(s.nextLine());
			List<Byte> N = new ArrayList<Byte>();
			M.add(N);

			while (t.hasNextByte()) {
				N.add(t.nextByte());
			}
		}
		

		int r = M.size();// rows
		int max = Integer.MIN_VALUE;
		
		if (r > 0) {
			int c = M.get(0).size(); // cols
			if (c > 0) {

				// i, j will determine the size of the submatrix
				for (int i = r; i > 0; i--) {
					for (int j = c; j > 0; j--) {
						// x, y will determine the top left of the submatrix
						for (int x = 0; x <= r - i; x++) {
							for (int y = 0; y <= c - j; y++) {
								int sum = 0;
								for (int a = x; a < x + i; a++) {
									for (int b = y; b < y + j; b++) {
										sum += M.get(a).get(b);
									}
								}
								max = sum > max ? sum : max;
							}
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
