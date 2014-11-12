import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;



public class Sudoku {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String[] b = a[1].split(",");
			int c = Integer.parseInt(a[0]);
			
			System.out.println(ok(c, b) ? "True" : "False");
		}
	}
	
	public static boolean ok(int s, String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < (i/s+1)*s; j++) {
				if (a[i].equals(a[j])) {
					return false;
				}
			}
			for (int j = i+s; j < a.length; j+=s) {
				if (a[i].equals(a[j])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
