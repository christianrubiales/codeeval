import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;



public class ValidParentheses {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			Deque<Character> t = new LinkedList<Character>();
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == '(' || c == '[' || c == '{') {
					t.push(c);
				} else if (!t.isEmpty()) {
					if (((c == ')' && (c = t.peek()) == '(')) ||
						((c == ']' && (c = t.peek()) == '[')) || 
						((c == '}' && (c = t.peek()) == '{'))) {
						t.pop();
					}
				}
			}
			System.out.println(t.isEmpty() ? "True" : "False");
		}
	}
}
