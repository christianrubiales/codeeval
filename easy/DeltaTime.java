import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DeltaTime {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			int t1, h1, m1, s1, t2, h2, m2, s2;
			
			h1 = ((s.charAt(0) - 48)  * 10);
			h1 += (s.charAt(1) - 48);
			m1 = ((s.charAt(3) - 48) * 10);
			m1 += (s.charAt(4) - 48);
			s1 = ((s.charAt(6) - 48) * 10);
			s1 += (s.charAt(7) - 48);

			h2 = ((s.charAt(9) - 48)  * 10);
			h2 += (s.charAt(10) - 48);
			m2 = ((s.charAt(12) - 48) * 10);
			m2 += (s.charAt(13) - 48);
			s2 = ((s.charAt(15) - 48) * 10);
			s2 += (s.charAt(16) - 48);
			
			t1 = ((h1 * 60 * 60) +  (m1 * 60) + s1);
			t2 = ((h2 * 60 * 60) +  (m2 * 60) + s2);
			
			t1 = t1 > t2 ? t1-t2 : t2-t1;
			
			h1 = t1 / (60 * 60);
			t1 = t1 - (h1 * 60 * 60);
			m1 = t1 / 60;
			t1 = t1 - (m1 * 60);
			
			StringBuffer b = new StringBuffer();
			if (h1 < 10) b.append("0");
			b.append(h1).append(':');
			if (m1 < 10) b.append("0");
			b.append(m1).append(':');
			if (t1 < 10) b.append("0");
			b.append(t1);
			System.out.println(b.toString());
		}
	}
}
