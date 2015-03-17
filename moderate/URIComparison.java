import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Scanner;


public class URIComparison {

	public static void main(String[] a) throws IOException, URISyntaxException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] b = l.split(";");
			URL u0 = new URL(b[0]);
			URL u1 = new URL(b[1]);
			
			String c0 = u0.getFile().toLowerCase();
			String c1 = u1.getFile().toLowerCase();
			
			try {
				c0 = URLDecoder.decode(c0);
			} catch (IllegalArgumentException e) {}
			try {
				c1 = URLDecoder.decode(c1);
			} catch (IllegalArgumentException e) {}
			
			u0 = new URL(u0.getProtocol(), u0.getHost(), u0.getPort(), "");
			u1 = new URL(u1.getProtocol(), u1.getHost(), u1.getPort(), "");
			
			System.out.println((u0.equals(u1) && c0.equals(c1)) ? "True" : "False");
		}
	}

}
