


public class GridWalk {

	public static void main(String[] args) {
		int x = 0;
		for (int a = 0; a < 20; a++) {
			for (int b = 0; b < 20; b++) {
				for (int c = 0; c < 20; c++) {
					for (int d = 0; d < 20; d++) {
						if (a+b+c+d < 20) {
//							System.out.println(a+","+b+";"+c+","+d);
							x++;
						}
					}
				}
			}
		}
		System.out.println(x*2-1);
	}
}
