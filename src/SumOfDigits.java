import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			int sum = 0;
			for (byte i = 0; i < line.length(); i++) {
				sum += Integer.parseInt("" + line.charAt(i));
			}
			System.out.println(sum);
		}
	}

}
