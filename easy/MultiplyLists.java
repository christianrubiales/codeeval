import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MultiplyLists {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\| ");
			String[] b = a[0].split("\\ ");
			String[] c = a[1].split("\\ ");
			int[] d = new int[b.length];
			
			int x, y;
			for (int i = 0; i < b.length; i++) {
				x = Integer.parseInt(b[i]);
				y = Integer.parseInt(c[i]);
				d[i] = x*y;
			}
			for (int i = 0; i < b.length; i++) {
				System.out.print(d[i]);
				if (i < b.length - 1) {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
