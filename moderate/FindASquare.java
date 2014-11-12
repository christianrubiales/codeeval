import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class FindASquare {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(",\\ ");
			float[] b = new float[3];
			
			b[0] = d(a[0], a[1]);
			b[1] = d(a[0], a[2]);
			b[2] = d(a[0], a[3]);
			Arrays.sort(b);
			// 3rd length is the hypotenuse
			System.out.println(b[0] != 0 && b[1] != 0 && b[2] != 0 && b[0] == b[1] && b[2] == ((float) Math.sqrt(2*Math.pow(b[0], 2)))*100/100);
		}
	}
	
	/**
	 * @return distance
	 */
	public static float d(String a, String b) {
		a = a.replace("(", "").replace(")", "");
		b = b.replace("(", "").replace(")", "");
		int x1, y1, x2, y2;
		
		String[] t = a.split(",");
		x1 = Integer.parseInt(t[0]);
		y1 = Integer.parseInt(t[1]);
		
		t = b.split(",");
		x2 = Integer.parseInt(t[0]);
		y2 = Integer.parseInt(t[1]);
		
		return ((float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)))*100/100;
	}
	
}
