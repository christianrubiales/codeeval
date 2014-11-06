import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NModM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			
			while (x >= y) {
				x -= y;
			}
			System.out.println(x);
		}
	}
}
