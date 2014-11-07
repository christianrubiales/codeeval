import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordToDigit {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String[][] b = new String[][]{{"zero","0"},{"one","1"},{"two","2"},{"three","3"},{"four","4"},
					{"five","5"},{"six","6"},{"seven","7"},{"eight","8"},{"nine","9"}};
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i].equals(b[j][0])) {
						System.out.print(b[j][1]);
					}
				}
			}
			System.out.println();
		}
	}

}
