import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FindTheHighestScore {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNextLine()) {
			String[] arr1 = s.nextLine().split("\\|");
			int size = arr1[0].split(" ").length;
			
			// init
			int[] max = new int[size];
			for (int i = 0; i < max.length; i++) {
				max[i] = Integer.MIN_VALUE;
			}
			
			// find max
			for (String str : arr1) {
				String[] arr2 = str.trim().split(" ");
				for (int i = 0; i < arr2.length; i++) {
					int j = Integer.parseInt(arr2[i]);
					if (j > max[i]) {
						max[i] = j;
					}
				}
			}

			// print
			for (int i = 0; i < max.length; i++) {
				System.out.print(max[i]);
				if (i < max.length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
