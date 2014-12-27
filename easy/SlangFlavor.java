import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SlangFlavor {

	private static final String[] REPS = {", yeah!", ", this is crazy, I tell ya.", ", can U believe this?", ", eh?", 
		", aw yea.", ", yo.", "? No way!", ". Awesome!"};
	
	public static void main(String[] a) throws IOException {
		int count = 0;
		StringBuilder u = new StringBuilder();
		FileReader r = new FileReader(new File(a[0]));
		boolean other = false;
		while (r.ready()) {
			char c = (char) r.read();
			
			if (c == '.' || c == '!' || c == '?') {
				if (other) {
					u.append(REPS[count % REPS.length]);
					++count;
				} else {
					u.append(c);
				}
				other = !other;
			} else {
				u.append(c);
			}
		}
		
		System.out.println(u.toString());
	}
}
