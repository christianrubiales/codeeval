import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Skyscrapers {

	public static void main(String[] g) throws IOException {
		Scanner s = new Scanner(new File(g[0]));
		while (s.hasNextLine()) {
			String[] array = s.nextLine().replace("(", "").replace(")", "").replace(" ", "").split(";");
			List<Integer> heights = new ArrayList<Integer>();
			
			String[] temp;
			for (String a : array) {
				temp = a.split(",");
				
				int start = Integer.parseInt(temp[0]);
				int h = Integer.parseInt(temp[1]);
				int end = Integer.parseInt(temp[2]);
				
				for (int i = start; i <= end; i++) {
					for (int j = heights.size(); j <= end; j++) {
						heights.add(0);
					}
					for (int j = start; j < end; j++) {
						if (h > heights.get(j)) {
							heights.set(j, h);
						}
					}
				}
			}
			
			int height = 0;
			
			StringBuilder u = new StringBuilder();
			for (int i = 0; i < heights.size(); i++) {
				if (height != heights.get(i).intValue()) {
					u.append(height).append(" ").append(i).append(" ");
					height = heights.get(i);
				}
			}
			System.out.println(u.substring(1).trim() + " 0");
		}
	}

}
