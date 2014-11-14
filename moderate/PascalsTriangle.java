import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PascalsTriangle {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			int p = s.nextInt();
			
			List<Integer> l = new ArrayList<Integer>();
			for (int i = 1; i <= p; i++) { // level
				for (int j = 0; j < i; j++) { // number of items per level
					if (j == 0 || j == i-1) {
						l.add(1);
					} else {
						int k = l.size() - i;
						l.add(l.get(k) + l.get(k+1));
					}
				}
			}
			
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < l.size() - 1; i++) { // level
				u.append(l.get(i)).append(' ');
			}
			u.append(l.get(l.size() - 1));
			System.out.println(u.toString());
		}
	}
}
