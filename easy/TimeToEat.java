import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class TimeToEat {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String[] arr = s.nextLine().split(" ");
			SortedMap<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
			
			for (String str : arr) {
				int c = 0;
				
				c += Integer.parseInt(str.substring(0, 2)) * 3600;
				c += Integer.parseInt(str.substring(3, 5)) * 60;
				c += Integer.parseInt(str.substring(6, 8));
				map.put(c, str);
			}
			
			for (Integer k : map.keySet()) {
				System.out.print(map.get(k) + " ");
			}
			System.out.println();
		}
	}
}
