import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SplitTheNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			
			int b = a[1].indexOf('-');
			int c = a[1].indexOf('+');
			int x = Integer.parseInt(a[0].substring(0, b > c ? b : c));
			int y = Integer.parseInt(a[0].substring(b > c ? b : c));
			System.out.println(x + ((b > c ? -1 : 1) * y));
		}
	}

}
