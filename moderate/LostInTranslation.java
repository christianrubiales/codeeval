import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * FIXME
 */
public class LostInTranslation {

	public static void main(String[] a) throws FileNotFoundException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String line = s.nextLine();
			
			// tally
			int base = (int) 'a';
			int[] frequencies = new int[26];
			for (int i = 0; i < line.length(); i++) {
				if (' ' != line.charAt(i)) {
					frequencies[line.charAt(i) - base] = frequencies[line.charAt(i) - base] + 1;
				}
			}
			
			// put the frequencies in a treemap
			Map<Integer, List<Character>> frequencyMap = new TreeMap<Integer, List<Character>>(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
			for (int i = 0; i < frequencies.length; i++) {
				List<Character> list = frequencyMap.get(frequencies[i]);
				if (list == null) {
					list = new ArrayList<Character>();
					frequencyMap.put(frequencies[i], list);
				}
				list.add((char) (i + base));
			}
			
			// build the mapping
			Map<Character, Character> map = new LinkedHashMap<Character, Character>();
			map.put(' ', ' ');
			String e = "etaoinshrdlcumwfgypbvkjxqz";
			StringBuilder u = new StringBuilder();
			int c = 0;
			for (Integer i : frequencyMap.keySet()) {
				List<Character> list = frequencyMap.get(i);
				for (Character d : list) {
					map.put(d, e.charAt(c));
					u.append(d);
					c++;
				}
			}
//			System.out.println(map);
//			System.out.println(e);
//			System.out.println(u.toString());
			
			for (int i = 0; i < line.length(); i++) {
				System.out.print(map.get(line.charAt(i)));
			}
			System.out.println();
		}
	}

}
