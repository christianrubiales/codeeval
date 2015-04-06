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
			
			int[] r1 = rank(L);
			int[] r2 = rank(R);
			
			if (r1[0] > r2[0]) {
				System.out.println("left");
			} else if (r2[0] > r1[0]) {
				System.out.println("right");
			} else if (r1[0] == 1 && r2[0] == 1) {
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
	
	public static int[] rank(String[] h) {
		int[] r;
		if ((r = RF(h))[0] == 10) {
			return r;
		} else if ((r = SF(h))[0] == 9) {
			return r;
		} else if ((r = FK(h))[0] == 8) {
			return r;
		} else if ((r = FH(h))[0] == 7) {
			return r;
		} else if ((r = F(h))[0] == 6) {
			return r;
		} else if ((r = S(h))[0] == 5) {
			return r;
		} else if ((r = TK(h))[0] == 4) {
			return r;
		} else if ((r = TP(h))[0] == 3) {
			return r;
		} else if ((r = OP(h))[0] == 2) {
			return r;
		}
		
		return r;
	}
	
	// Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
	public static int[] RF(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
		char suit = h[0].charAt(1);
		
		if (h[0].charAt(0) == 'J' && h[1].charAt(0) == 'K' && h[2].charAt(0) == 'L' && h[3].charAt(0) == 'M' && h[4].charAt(0) == 'N') {
			for (String s : h) {
				if (s.charAt(1) != suit) {
					return r;//false
				}
			}
			r[0] = 10;
			r[1] = 'N';
			return r;//true
		}
		
		return r;//false
	}

	// Straight Flush: All cards are consecutive values of same suit.
	public static int[] SF(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
		char suit = h[0].charAt(1);
		for (String s : h) {
			if (s.charAt(1) != suit) {
				return r;//false
			}
		}
		char c = h[0].charAt(0);
		for (int i = 1; i < 5; i++) {
			if (h[i].charAt(0) != Character.valueOf((char) (i + c))) {
				return r;//false
			}
		}
		
		r[0] = 9;
		r[1] = h[4].charAt(0);
		return r;//true
	}
	
	// Four of a Kind: Four cards of the same value.
	public static int[] FK(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
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
		
		for (Character c : m.keySet()) {
			if (m.get(c) == 4) {
				r[0] = 8;
				r[1] = c;
				break;
			}
		}
		
		return r;
	}
	
	// Full House: Three of a kind and a pair.
	public static int[] FH(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
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
				r[0] = 7;
				
				for (Character c : m.keySet()) {
					if (m.get(c) == 3) {
						r[1] = c;
						return r;//true
					}
				}
			}
		}
		
		return r;//false
	}

	// Flush: All cards of the same suit.
	public static int[] F(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
		char suit = h[0].charAt(1);
		
		for (String s : h) {
			if (s.charAt(1) != suit) {
				return r;//false
			}
		}
		
		r[0] = 6;
		r[1] = h[4].charAt(0);
		return r;//true
	}

	// Straight: All cards are consecutive values.
	public static int[] S(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
		char c = h[0].charAt(0);
		for (int i = 1; i < 5; i++) {
			if (h[i].charAt(0) != Character.valueOf((char) (i + c))) {
				return r;//false
			}
		}

		r[0] = 5;
		r[1] = h[4].charAt(0);
		return r;//true
	}

	// Three of a Kind: Three cards of the same value.
	public static int[] TK(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
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
		
		for (Character c : m.keySet()) {
			if (m.get(c) == 3) {
				r[0] = 4;
				r[1] = c;
				break;
			}
		}
		
		return r;
	}

	// Two Pairs: Two different pairs.
	public static int[] TP(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
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
		
		if (c == 2) {
			int x = 0;
			for (Character d : m.keySet()) {
				x = Math.max(x, d);
			}
			r[0] = 3;
			r[1] = x;
		}
		
		return r;
	}
	
	// One Pair: Two cards of the same value.
	public static int[] OP(String[] h) {
		int[] r = new int[2];
		r[0] = -1;
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
		
		for (Character c : m.keySet()) {
			if (m.get(c) == 2) {
				r[0] = 2;
				r[1] = c;
				break;
			}
		}
		
		return r;
	}

	public static char hi(String[] h) {
		return h[4].charAt(0);
	}
}
