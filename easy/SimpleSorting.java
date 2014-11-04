import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;


public class SimpleSorting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		DecimalFormat d = new DecimalFormat("0.000");
		String line;
		while ((line = br.readLine()) != null) {
			String[] s = line.split("\\ ");
			float[] f = new float[s.length];
			
			for (int i = 0; i < s.length; i++) {
				f[i] = Float.parseFloat(s[i]);
			}
			Arrays.sort(f);
			
			StringBuffer b = new StringBuffer();
			for (int i = 0; i < s.length; i++) {
				b.append(d.format(f[i])).append(" ");
			}
			System.out.println(b.toString().trim());
		}
	}
}
