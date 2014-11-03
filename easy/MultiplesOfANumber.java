import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MultiplesOfANumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] a = line.split(",");
			int x = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			int n = m;
			
			int t = n;
			while (n < x) {
				if (n > x) {
					System.out.println(t);
					break;
				} else if (n == x) {
					System.out.println(n);
					break;
				} else {
					t = n;
					n+=m;
					if (n >= x) {
						System.out.println(n);
						break;
					}
				}
			}
		}
	}

}
