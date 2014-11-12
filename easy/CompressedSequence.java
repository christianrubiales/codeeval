import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class CompressedSequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			
			StringBuffer u = new StringBuffer();
			int c = 1;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].equals(a[i+1])) {
					c++;
				} else {
					u.append(c).append(' ').append(a[i]).append(' ');
					c = 1;
				}
			}
			
			if (a.length == 1) {
				u.append(c).append(' ').append(a[0]);
			} else {
				u.append(c).append(' ').append(a[a.length - 1]);
			}
			System.out.println(u.toString().trim());
		}
	}

}
