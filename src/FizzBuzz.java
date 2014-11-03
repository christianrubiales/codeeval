import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FizzBuzz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] a = line.split("\\ ");
			byte f = Byte.parseByte(a[0]);
			byte b = Byte.parseByte(a[1]);
			byte n = Byte.parseByte(a[2]);
			
			StringBuffer sb = new StringBuffer();
			for (byte i = 1; i <= n; i++) {
				if (i % f == 0 && i % b == 0) {
					sb.append("FB");
				} else if (i%f==0) {
					sb.append("F");
				} else if (i%b==0) {
					sb.append("B");
				} else {
					sb.append(i);
				}
				sb.append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}

}
