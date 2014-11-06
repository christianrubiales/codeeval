import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RightmostChar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",");
			char c = a[1].charAt(0);
			int j = -1;
			for (int i = 0; i < a[0].length(); i++) {
				if (c == a[0].charAt(i)) {
					j = i;
				}
			}
			System.out.println(j);
		}
	}
}
