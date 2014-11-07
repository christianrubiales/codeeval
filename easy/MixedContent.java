import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class MixedContent {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			List<String> b = new LinkedList<String>();
			List<String> c = new LinkedList<String>();
			
			for (int i = 0; i < a.length; i++) {
				int t;
				try {
					t = Integer.parseInt(a[i]);
					c.add("" + t);
				} catch (Exception e) {
					b.add(a[i]);
				}
			}
			
			for (int i = 0; i < b.size(); i++) {
				System.out.print(b.get(i));
				if (i < b.size() - 1) {
					System.out.print(',');
				}
			}
			
			if (!b.isEmpty() && !c.isEmpty()) {
				System.out.print('|');
			}

			for (int i = 0; i < c.size(); i++) {
				System.out.print(c.get(i));
				if (i < c.size() - 1) {
					System.out.print(',');
				}
			}
			System.out.println();
		}
	}

}
