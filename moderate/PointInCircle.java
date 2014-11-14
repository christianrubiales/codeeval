import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class PointInCircle {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			
			// parsing
			float cx = Float.parseFloat(l.substring(l.indexOf("(") + 1, l.indexOf(",")));
			float cy = Float.parseFloat(l.substring(l.indexOf(",") + 1, l.indexOf(")")));
			l = l.substring(l.indexOf(";"));
			float r = Float.parseFloat(l.substring(l.indexOf(": ") + 2, l.indexOf("; P")));
			l = l.substring(l.indexOf(";"));
			float x = Float.parseFloat(l.substring(l.indexOf("(") + 1, l.indexOf(",")));
			float y = Float.parseFloat(l.substring(l.indexOf(",") + 1, l.indexOf(")")));
			
			// if the distance from the center to the point is greater than the radius, the point is outside the circle
			double d = Math.sqrt((cx - x)*(cx - x) + (cy - y)*(cy - y));
			
			System.out.println(d <= r);
		}
	}
}
