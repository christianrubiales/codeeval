import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NiceAngles {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		int i;
		float f;
		while ((s = br.readLine()) != null) {
			i = s.indexOf('.') + 1;
			System.out.print(s.substring(0, i));
			f = Float.parseFloat(s.substring(i-1));
			i = ((int) (f * 60));
			System.out.print((i > 9 ? "" : "0") + i + "'");
			f = (f * 60) - i;
			i = ((int) (f * 60));
			System.out.print((i > 9 ? "" : "0") + i + "\"");
			System.out.println();
		}
	}
}
