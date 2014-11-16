import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GuessTheNumber {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split("\\ ");
			int n = Integer.parseInt(x[0]);

			List<Integer> L = new ArrayList<Integer>();
			for (int i = 0; i <= n; i++) {
				L.add(i);
			}

			n = L.size()%2==0 ? (L.size()/2) : (L.size()/2);
			for (int i = 1; i < x.length - 1; i++) {
				if ("Lower".equals(x[i])) {
					L = L.subList(0, n);
				} else if ("Higher".equals(x[i])) {
					L = L.subList(n+1, L.size());
				}
				n = L.size()/2;
			}
			System.out.println(L.get(n));
		}
	}
}
