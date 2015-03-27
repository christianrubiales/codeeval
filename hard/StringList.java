import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class StringList {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(args[0]));

		String[] array;
		while (in.hasNextLine()) {
			array = in.nextLine().split(",");
			
			SortedSet<String> set = new TreeSet<String>();
			perm(array[1].toCharArray(), Integer.parseInt(array[0]), "", set);
			
			StringBuilder sb = new StringBuilder();
			Iterator<String> iter = set.iterator();
			for (int i = 0; i < set.size() - 1; i++) {
				sb.append(iter.next() + ",");
			}
			sb.append(iter.next());
			System.out.println(sb.toString());
		}
	}

	public static void perm(char[] c, int n, String prefix, SortedSet<String> set) {
		if (prefix.length() >= n) {
			set.add(prefix);
		} else {
			for (int i = 0; i < c.length; i++) {
				perm(c, n, prefix + c[i], set);
			}
		}
	}

}
