import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class SumOfIntegers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			int[] j = new int[a.length];
			
			j[0] = Integer.parseInt(a[0].trim());
			int mh = j[0], ms = j[0];
			for (int i = 1; i < j.length; i++) {
				mh = Math.max(Integer.parseInt(a[i].trim()), mh + Integer.parseInt(a[i].trim()));
				ms = Math.max(mh, ms);
			}
			System.out.println(ms);
		}
	}
}
