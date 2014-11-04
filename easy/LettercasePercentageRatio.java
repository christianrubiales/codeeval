import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class LettercasePercentageRatio {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		DecimalFormat f = new DecimalFormat("0.00");
		String line;
		while ((line = br.readLine()) != null) {
			int c=0;
			float a=0, b=0;
			for (int i=0;i<line.length();i++) {
				if (Character.isLowerCase(line.charAt(i))) {
					a++;
				} else {
					b++;
				}
				c++;
			}
			System.out.println("lowercase: " + f.format(a/c*100.00) + " uppercase: " + f.format(b/c*100.00));
		}
	}
}
