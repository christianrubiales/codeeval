import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class BigDigits {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			
			// get size without non-numerics
			List<Integer> c = new LinkedList<Integer>();
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					c.add(Integer.parseInt("" + s.charAt(i)));
				}
			}

			List<String[]> d = new LinkedList<String[]>();
			d.add(c0);d.add(c1);d.add(c2);d.add(c3);d.add(c4);d.add(c5);d.add(c6);d.add(c7);d.add(c8);d.add(c9);
			
			// start printing
			String s1="", s2="", s3="", s4="", s5="", s6="";
			for (int i = 0; i < c.size(); i++) {
				s1 += d.get(c.get(i))[0];
				s2 += d.get(c.get(i))[1];
				s3 += d.get(c.get(i))[2];
				s4 += d.get(c.get(i))[3];
				s5 += d.get(c.get(i))[4];
				s6 += d.get(c.get(i))[5];
			}
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
		}
	}
	
	static String[] c0 = new String[] {
		"-**--",
		"*--*-",
		"*--*-",
		"*--*-",
		"-**--",
		"-----"
	};
	
	static String[] c1 = new String[] {
		"--*--",
		"-**--",
		"--*--",
		"--*--",
		"-***-",
		"-----"
	};
	
	static String[] c2 = new String[] {
		"***--",
		"---*-",
		"-**--",
		"*----",
		"****-",
		"-----"
	};
	
	static String[] c3 = new String[] {
		"***--",
		"---*-",
		"-**--",
		"---*-",
		"***--",
		"-----"
	};
	
	static String[] c4 = new String[] {
		"-*---",
		"*--*-",
		"****-",
		"---*-",
		"---*-",
		"-----"
	};
	
	static String[] c5 = new String[] {
		"****-",
		"*----",
		"***--",
		"---*-",
		"***--",
		"-----"
	};
	
	static String[] c6 = new String[] {
		"-**--",
		"*----",
		"***--",
		"*--*-",
		"-**--",
		"-----"
	};
	
	static String[] c7 = new String[] {
		"****-",
		"---*-",
		"--*--",
		"-*---",
		"-*---",
		"-----"
	};
	
	static String[] c8 = new String[] {
		"-**--",
		"*--*-",
		"-**--",
		"*--*-",
		"-**--",
		"-----"
	};
	
	static String[] c9 = new String[] {
		"-**--",
		"*--*-",
		"-***-",
		"---*-",
		"-**--",
		"-----"
	};
}
