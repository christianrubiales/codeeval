import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;



public class FirstNonRepeatedCharacter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String f,n,c;
			for (int i = 0; i < s.length(); i++) {
				c = "" + s.charAt(i);
				f = s.substring(0, i);
				n = s.substring(i+1 <= s.length() ? i+1 : i);
				if (!f.contains(c) && !n.contains(c)) {
					System.out.println(c);
					break;
				}
			}
		}
	}
}
