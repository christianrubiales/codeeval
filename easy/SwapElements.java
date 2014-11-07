import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SwapElements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(":");
			String[] b = a[0].split("\\ ");
			String[] c = a[1].split(",");
			
			for (int i = 0; i < c.length; i++) {
				int j = c[i].indexOf('-');
				int x = Integer.parseInt(c[i].substring(0, j).trim());
				int y = Integer.parseInt(c[i].substring(j+1).trim());
				String t = b[x];
				b[x] = b[y];
				b[y] = t;
			}
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				u.append(b[i]).append(' ');
			}
			System.out.println(u.toString().trim());
		}
	}

}
