import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PenultimateWord {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			System.out.println(a[a.length - 2]);
		}
	}
}
