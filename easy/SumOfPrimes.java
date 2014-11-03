


public class SumOfPrimes {

	public static void main(String[] args) {
		
		short[] m = getPrimes();
		int sum = 0;
		boolean p;
		short i = 2;
		short c = 0;
		while (c != 1000) {
				p = true;
				for (short j = 0; j < m.length; j++) {
					if (i == m[j]) {
						break;
					}
					if (i%m[j]==0) {
						p = false;
						break;
					}
				}
				if (p) {
					sum += i;
					c++;
				}
				i++;
		}
		System.out.println(sum);
	}
	
	public static short[] getPrimes() {
		// start with array with all trues
		boolean[] a = new boolean[1920];
		for (short i = 0; i < 1920; i++) {
			a[i] = true;
		}

		byte[] m = new byte[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43};
		
		// up to the square root of the square root
		for (int i = 2; i < 1920; i++) {
			if (a[i]) {
				for (short j = 0; j < m.length; j++) {
					if (i!=m[j] && i%m[j]==0) {
						a[i] = false;
					}
				}
			}
		}
		
		// count number of primes
		short p = 0;
		for (short i = 2; i < 1920; i++) {
			if (a[i]) p++;
		}
		
		// put all primes into the array to return
		short[] b = new short[p];
		short c = 0;
		for (short i = 2; i < 1920; i++) {
			if (a[i]) {
				b[c] = i;
				c++;
			}
		}
		
		return b;
	}

}
