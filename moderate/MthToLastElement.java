import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;



public class MthToLastElement {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\\ ");
			int i = Integer.parseInt(a[a.length - 1]);
			
			System.out.println(i > a.length - 1 ? "" : a[a.length - i - 1]);
		}
	}
}
