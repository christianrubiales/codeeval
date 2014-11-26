import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class SumToZero {

	/**
	 * get pairs, and check pairs of pairs if they sum to zero, use indices to handle duplicate numbers
	 */
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split(",");
			int[] y = new int[x.length];
			
			for (int i = 0; i < y.length; i++) {
				y[i] = Integer.parseInt(x[i]);
			}
			
			// pairs
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < y.length; i++) {
				for (int j = 0; j < y.length; j++) {
					if (i != j) {
						map.put(i + "," + j, y[i] + y[j]);
					}
				}
			}

			// match all unique pairs
			String[] k = new String[4];
			HashSet<String> set = new HashSet<String>();
			for (String b : map.keySet()) {
				for (String c : map.keySet()) {
					if (!b.equals(c) && (map.get(b) + map.get(c) == 0)) {
						x = b.split(",");
						k[0] = x[0];
						k[1] = x[1];
						x = c.split(",");
						k[2] = x[0];
						k[3] = x[1];
						
						if (!k[0].equals(k[1]) && !k[0].equals(k[2]) && !k[0].equals(k[3]) && !k[1].equals(k[2]) && !k[1].equals(k[3]) && !k[2].equals(k[3])) {
							Arrays.sort(k);
							StringBuffer u = new StringBuffer();
							for (int i = 0; i < 3; i++) {
								u.append(k[i]).append(',');
							}
							u.append(k[3]);
							
							set.add(u.toString());
						}
					}
				}
			}
			System.out.println(set.size());
		}
	}
}
