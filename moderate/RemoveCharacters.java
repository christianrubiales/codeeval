import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class RemoveCharacters {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(", ");
			
			for (int i = 0; i < a[1].length(); i++) {
				a[0] = a[0].replace("" + a[1].charAt(i), "");
			}
			System.out.println(a[0]);
		}
	}
}
