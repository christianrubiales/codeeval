import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class NumberPairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			String[] a = s.split(";");
			String r = "";
			if (a.length > 1) {
				String[] b = a[0].split(",");
				int k = Integer.parseInt(a[1]);
	
				
				for (int i = 0; i < b.length - 1; i++) {
					for (int j = i+1; j < b.length; j++) {
						if (Integer.parseInt(b[j]) == k - Integer.parseInt(b[i])) {
							r += b[i] + "," + b[j] + ";";
						}
					}
				}
				System.out.println(r.isEmpty() ? "NULL" : r.substring(0, r.length() - 1));
			} else {
				System.out.println();
			}
			
		}
	}
}
