import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BitPositions {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] a = line.split(",");
			int n = Integer.parseInt(a[0]);
			int p1 = Integer.parseInt(a[1]);
			int p2 = Integer.parseInt(a[2]);
			
			String s = Integer.toBinaryString(n);
			int len = s.length();
			System.out.println(s.charAt(len-p1) == s.charAt(len-p2));
		}

	}

}
