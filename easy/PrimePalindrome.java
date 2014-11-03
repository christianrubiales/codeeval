
public class PrimePalindrome {

	public static void main(String[] args) {
		String s;
		byte l1, l2;
		boolean p;
		for (short i = 999; i > 0; i--) {
			p = true;
			// check if prime
			if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 
					&& i%11!=0 && i%13!=0 && i%17!=0 && i%19!=0 
					&& i%23!=0 && i%29!=0 && i%31!=0) {
				
				// check if palindrome
				s = "" + i;
				l1 = (byte) s.length();
				l2 = (byte) (l1 / 2);
				l1--;
				for (byte b = 0; b < l2; b++) {
					if (s.charAt(b) != s.charAt(l1 - b)) {
						p = false;
						break;
					}
				}
				
				if (p) {
					System.out.println(i);
					return;
				}
			}
		}
	}

}
