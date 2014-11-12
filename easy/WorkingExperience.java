import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WorkingExperience {

	static List<String> M = new ArrayList<String>();
	static {
		M.add("Jan");M.add("Feb");M.add("Mar");M.add("Apr");M.add("May");M.add("Jun");M.add("Jul");M.add("Aug");M.add("Sep");M.add("Oct");M.add("Nov");M.add("Dec");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("; ");
			Set<String> t = new HashSet<String>();
			
			int j;
			for (int i = 0; i < a.length; i++) {
				j = a[i].indexOf('-');
				t.addAll(g(a[i].substring(0, j), a[i].substring(j+1)));
			}
			
			System.out.println(Math.round(t.size() / 12));
		}
	}
	
	static List<String> g(String a, String b) {
		List<String> l = new ArrayList<String>();
		
		// get years
		int z = a.indexOf(' ');
		int x = Integer.parseInt(a.substring(z + 1));
		int y = Integer.parseInt(b.substring(z + 1));
		
		// get the index of the first month
		String c = a.substring(0, z);
		for (int i = 0; i < M.size(); i++) {
			if (M.get(i).equals(c)) {
				z = i;
				break;
			}
		}
		
		// iterate from first to last month
		String t = a;
		while (!t.equals(b)) {
			t = M.get(z) + " " + x;
			l.add(t);
			z++;
			if (z == 12) {
				z = 0;
				x++;
			}
		}
		
		return l;
	}

}
