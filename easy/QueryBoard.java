import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class QueryBoard {
	
	static short X = 256;
	static short[][] M = new short[X][X];

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String i = s.nextLine();
			String[] b = i.split("\\ ");
			
			if ("SetCol".equals(b[0])) {
				sc(Integer.parseInt(b[1]), Short.parseShort(b[2]));
			} else if ("SetRow".equals(b[0])) {
				sr(Integer.parseInt(b[1]), Short.parseShort(b[2]));
			} else if ("QueryRow".equals(b[0])) {
				System.out.println(qr(Integer.parseInt(b[1])));
			} else if ("QueryCol".equals(b[0])) {
				System.out.println(qc(Integer.parseInt(b[1])));
			}
		}
	}
	
	static void sr(int i, short x) {
		for (int j = 0; j < X; j++) {
			M[i][j] = x;
		}
	}
	
	static void sc(int i, short x) {
		for (int j = 0; j < X; j++) {
			M[j][i] = x;
		}
	}
	
	static short qr(int i) {
		short s = 0;
		for (int j = 0; j < X; j++) {
			s += M[i][j];
		}
		return s;
	}
	
	static short qc(int i) {
		short s = 0;
		for (int j = 0; j < X; j++) {
			s += M[j][i];
		}
		return s;
	}
}
