

public class MultiplicationTables {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 12; i++) {
			StringBuffer s = new StringBuffer();
			for (int j = 1; j <= 12; j++) {
				x = i*j;
				if (j != 1) {
					s.append(" ");
					if (x < 100) {
						s.append(" ");
					}
					if (x < 10) {
						s.append(" ");
					}
				}
				s.append(x);
			}
			System.out.println(s.toString());
		}
	}
}
