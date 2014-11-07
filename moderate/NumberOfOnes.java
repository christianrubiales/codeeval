import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class NumberOfOnes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			s = Integer.toBinaryString(Integer.parseInt(s));
			int c = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
