import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;



public class ReverseGroups {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String[] b = a[0].split(",");
			int j = Integer.parseInt(a[1]);
			int[] d = new int[b.length];

			for (int i = 0; i < b.length; i+=j) {
				if (i+j <= b.length) {
					for (int k = 0; k < j; k++) {
						d[i+k] = Integer.parseInt(b[i+j-k-1]);
					}
				} else {
					for (int k = i; k < b.length; k++) {
						d[k] = Integer.parseInt(b[k]);
					}
				}
			}
			StringBuffer u = new StringBuffer(); 
			for (int i = 0; i < d.length; i++) {
				u.append(d[i]).append(',');
			}
			s = u.toString();
			System.out.println(s.substring(0, s.length() - 1));
		}
	}
}
