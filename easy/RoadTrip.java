import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class RoadTrip {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";\\ *");
			int[] b = new int[a.length];
			
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i].substring(a[i].indexOf(",") + 1));
			}
			Arrays.sort(b);
			int c = 0;
			StringBuffer u = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				u.append(b[i] - c);
				c = b[i];
				if (i < b.length - 1) {
					u.append(',');
				}
			}
			System.out.println(u.toString());
		}
	}

}
