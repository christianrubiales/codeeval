import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;



public class StackImplementation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			
			StringBuffer b = new StringBuffer(); 
			for (int i = a.length - 1; i >= 0; i -= 2) {
				b.append(a[i]).append(' ');
			}
			System.out.println(b.toString().trim());
		}
	}
}
