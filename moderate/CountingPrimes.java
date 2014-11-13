

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountingPrimes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String l;
		while ((l = br.readLine()) != null) {
			int z = l.indexOf(',');
			int x = Integer.parseInt(l.substring(0, z));
			int y = Integer.parseInt(l.substring(z+1));
			List<Long> s = p(x, y);
			
			System.out.println(s.size());
		}
	}

	/**
	 * Sieve of Eratosthenes
	 */
	static List<Long> p(long x, long y) {
		List<Long> l = new ArrayList<Long>();
		
		// populate with all number between 2 to max
		for (long i = x; i <= y; i++) {
			l.add(i);
		}
		
		for (long i = 2; i <= Math.sqrt(y); i++) {
			// remove the succeeding multiples of a base number
			for (long j = i; j <= y;) {
				j += i;
				if (l.contains(j)) {
					l.remove((Long) j);
				}
			}
		}
		
		return l;
	}
}
