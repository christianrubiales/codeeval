import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PokerHands {

	public static void main(String[] g) throws IOException {
		Scanner s = new Scanner(new File(g[0]));
		String l;
		while (s.hasNext()) {
			String[] L = new String[5];
			String[] R = new String[5];
			
			for (int i = 0; i < 5; i++) {
				L[i] = replace(s.next());
			}
			for (int i = 0; i < 5; i++) {
				R[i] = replace(s.next());
			}
			
			Arrays.sort(L);
			Arrays.sort(R);
			
			int r1 = rank(L);
			int r2 = rank(R);
			
			if (r1 > r2) {
				System.out.println("left");
			} else if (r2 > r1) {
				System.out.println("right");
			} else if (r1 == 1 && r2 == 1) {
				if (hi(L) > hi(R)) {
					System.out.println("left");
				} else if (hi(R) > hi(L)) {
					System.out.println("right");
				} else {
					System.out.println("none");
				}
			} else {
				System.out.println("none");
			}
		}
	}
	
	public static String replace(String h) {
		char c = h.charAt(0);
		
		if (c == '2') {
			h = h.replace('2', 'B');
		} else if (c == '3') {
			h = h.replace('3', 'C');
		} else if (c == '4') {
			h = h.replace('4', 'D');
		} else if (c == '5') {
			h = h.replace('5', 'E');
		} else if (c == '6') {
			h = h.replace('6', 'F');
		} else if (c == '7') {
			h = h.replace('7', 'G');
		} else if (c == '8') {
			h = h.replace('8', 'H');
		} else if (c == '9') {
			h = h.replace('9', 'I');
		} else if (c == 'T') {
			h = h.replace('T', 'J');
		} else if (c == 'J') {
			h = h.replace('J', 'K');
		} else if (c == 'Q') {
			h = h.replace('Q', 'L');
		} else if (c == 'K') {
			h = h.replace('K', 'M');
		} else if (c == 'A') {
			h = h.replace('A', 'N');
		}
		
		return h;
	}
	
	public static int rank(String[] h) {
		if (RF(h)) {
			return 10;
		} else if (SF(h)) {
			return 9;
		} else if (FK(h)) {
			return 8;
		} else if (FH(h)) {
			return 7;
		} else if (F(h)) {
			return 6;
		} else if (S(h)) {
			return 5;
		} else if (TK(h)) {
			return 4;
		} else if (TP(h)) {
			return 3;
		} else if (OP(h)) {
			return 2;
		}
		
		return 1;
	}
	
	// Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
	public static boolean RF(String[] h) {
		char suit = h[0].charAt(1);
		
		if (h[0].charAt(0) == 'J' && h[1].charAt(0) == 'K' && h[2].charAt(0) == 'L' && h[3].charAt(0) == 'M' && h[4].charAt(0) == 'N') {
			for (String s : h) {
				if (s.charAt(1) != suit) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}

	// Straight Flush: All cards are consecutive values of same suit.
	public static boolean SF(String[] h) {
		char suit = h[0].charAt(1);
		for (String s : h) {
			if (s.charAt(1) != suit) {
				return false;
			}
		}
		char c = h[0].charAt(0);
		for (int i = 1; i < 5; i++) {
			if (h[i].charAt(0) != Character.valueOf((char) (i + c))) {
				return false;
			}
		}
		
		return true;
	}
	
	// Four of a Kind: Four cards of the same value.
	public static boolean FK(String[] h) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Integer i;
		for (String s : h) {
			i = m.get(s.charAt(0));
			if (i == null) {
				i = 0;
			}
			i++;
			m.put(s.charAt(0), i);
		}
		
		return m.containsValue(4);
	}
	
	// Full House: Three of a kind and a pair.
	public static boolean FH(String[] h) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Integer i;
		for (String s : h) {
			i = m.get(s.charAt(0));
			if (i == null) {
				i = 0;
			}
			i++;
			m.put(s.charAt(0), i);
		}
		
		if (m.keySet().size() == 2) {
			List<Integer> l = new ArrayList<Integer>();
			l.addAll(m.values());
			
			if ((l.get(0) == 3 && l.get(1) == 2) || (l.get(0) == 2 && l.get(1) == 3)) {
				return true;
			}
		}
		
		return false;
	}

	// Flush: All cards of the same suit.
	public static boolean F(String[] h) {
		char suit = h[0].charAt(1);
		
		for (String s : h) {
			if (s.charAt(1) != suit) {
				return false;
			}
		}
		
		return true;
	}

	// Straight: All cards are consecutive values.
	public static boolean S(String[] h) {
		char c = h[0].charAt(0);
		for (int i = 1; i < 5; i++) {
			if (h[i].charAt(0) != Character.valueOf((char) (i + c))) {
				return false;
			}
		}
		
		return true;
	}

	// Three of a Kind: Three cards of the same value.
	public static boolean TK(String[] h) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Integer i;
		for (String s : h) {
			i = m.get(s.charAt(0));
			if (i == null) {
				i = 0;
			}
			i++;
			m.put(s.charAt(0), i);
		}
		
		return m.containsValue(3);
	}

	// Two Pairs: Two different pairs.
	public static boolean TP(String[] h) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Integer i;
		for (String s : h) {
			i = m.get(s.charAt(0));
			if (i == null) {
				i = 0;
			}
			i++;
			m.put(s.charAt(0), i);
		}
		int c = 0;
		
		for (Integer j : m.values()) {
			if (j == 2) {
				c++;
			}
		}
		
		return c == 2;
	}
	
	// One Pair: Two cards of the same value.
	public static boolean OP(String[] h) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Integer i;
		for (String s : h) {
			i = m.get(s.charAt(0));
			if (i == null) {
				i = 0;
			}
			i++;
			m.put(s.charAt(0), i);
		}
		
		return m.containsValue(2);
	}

	public static char hi(String[] h) {
		return h[4].charAt(0);
	}
}
