import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ChardonnayOrCabernet {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String[] arr1 = s.nextLine().split("\\|");
			String sub = arr1[1].trim();
			String[] arr2 = arr1[0].split(" ");
			
			// init
			Map<char[], String> map = new LinkedHashMap<char[], String>();
			for (String str : arr2) {
				char[] arr = str.trim().toCharArray();
				map.put(arr, str.trim());
			}
			
			for (char c : sub.toCharArray()) {
				List<char[]> toRemove = new ArrayList<char[]>();
				for (char[] arr : map.keySet()) {
					Arrays.sort(arr);
					int index = Arrays.binarySearch(arr, c);
					if (index > -1) {
						arr[index] = ' ';
					} else {
						toRemove.add(arr);
					}
				}
				// remove
				for (char[] arr : toRemove) {
					map.remove(arr);
				}
			}
			
			// print
			int i = 0;
			if (map.isEmpty()) {
				System.out.println("False");
			} else {
				for (char[] arr : map.keySet()) {
					System.out.print(map.get(arr));
					if (i < map.size() - 1) {
						System.out.print(" ");
					}
					i++;
				}
				System.out.println();
			}
		}
	}
}
