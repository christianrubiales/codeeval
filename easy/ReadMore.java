import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadMore {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			if (line.length() <= 55) {
				System.out.println(line);
			} else {
				String s = line.substring(0, 40);
				
				int e = s.length();
				while (e > 0 && s.charAt(e - 1) != ' ') {
					e--;
				}
				if (e != 0) {
					s = s.substring(0, e);
				}
				
				System.out.println(s.trim() + "... <Read More>");
			}
		}
	}

}
