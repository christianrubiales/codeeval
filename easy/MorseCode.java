import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MorseCode {
	
	static Map<String, Character> M = new HashMap<String, Character>();
	
	static {
		M.put(".-", 'A');M.put("-...", 'B');M.put("-.-.", 'C');M.put("-..", 'D');M.put(".", 'E');
		M.put("..-.", 'F');M.put("--.", 'G');M.put("....", 'H');M.put("..", 'I');M.put(".---", 'J');
		M.put("-.-", 'K');M.put(".-..", 'L');M.put("--", 'M');M.put("-.", 'N');M.put("---", 'O');
		M.put(".--.", 'P');M.put("--.-", 'Q');M.put(".-.", 'R');M.put("...", 'S');M.put("-", 'T');
		M.put("..-", 'U');M.put("...-", 'V');M.put(".--", 'W');M.put("-..-", 'X');M.put("-.--", 'Y');M.put("--..", 'Z');
		M.put("-----", '0');M.put(".----", '1');M.put("..---", '2');M.put("...--", '3');M.put("....-", '4');
		M.put(".....", '5');M.put("-....", '6');M.put("--...", '7');M.put("---..", '8');M.put("----.", '9');M.put("~", ' ');
	}
	
	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			i = i.replace("  ", " ~ ");
			String[] b = i.split("\\ ");
			
			StringBuffer u = new StringBuffer();
			for (int j = 0; j < b.length; j++) {
				u.append(M.get(b[j]));
			}
			System.out.println(u.toString());
		}
	}
}
