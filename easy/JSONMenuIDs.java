import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class JSONMenuIDs {
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			i = gi(i);
			
			int x = 0;
			String[] y = i.split("},");
			for (int j = 0; j < y.length; j++) {
				if (y[j].contains("\"label\"")) {
					y[j] = y[j].trim();
					x += Integer.parseInt(y[j].substring(y[j].indexOf(':')+2, y[j].indexOf(", \"label")));
				}
			}
			System.out.println(x);
		}
	}
	
	static String gi(String i) {
		i = i.substring(i.indexOf("\"items\": [") + "\"items\": [".length());
		return i.substring(0, i.indexOf(']'));
	}
}
