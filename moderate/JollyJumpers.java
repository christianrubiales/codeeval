import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class JollyJumpers {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split("\\ ");
			
			int k, m = 0;
			List<Integer> t = new ArrayList<Integer>();
			for (String i : x) {
				k = Integer.parseInt(i);
				t.add(k);
				if (k > m) {
					m = k;
				}
			}
			
			boolean[] b = new boolean[m];
			for (int i = 0; i < t.size() - 1; i++) {
				k = Math.abs(t.get(i) - t.get(i+1)) - 1;
				if (k > -1 && k < m) {
					b[k] = true;
				}
			}
			
			boolean j = true;
			for (int i = 0; i < m - 1; i++) {
				if (!b[i]) {
					j = false;
					break;
				}
			}
			if (t.size() < 2) {
				j = false;
			}
			
			System.out.println(j ? "Jolly" : "Not jolly");
			

//			int k, m = 0;
//			List<Integer> t = new ArrayList<Integer>();
//			for (String i : x) {
//				k = Math.abs(Integer.parseInt(i));
//				t.add(k);
//				if (k > m) {
//					m = k;
//				}
//			}
//			Collections.sort(t);
//			
//			boolean j = true;
//			for (int i = 0; i < t.size(); i++) {
//				if (t.get(i) != i+1) {
//					j = false;
//					break;
//				}
//			}
//			
//			System.out.println(j ? "Jolly" : "Not jolly");
		}
	}
}
