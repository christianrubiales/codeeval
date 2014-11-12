import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RomanNumerals {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String s;
		while ((s = br.readLine()) != null) {
			StringBuffer u = new StringBuffer();
			int l = s.length(), j;
			for (int i = 0; i < l; i++) {
				j = Integer.parseInt("" + s.charAt(i)) * ((int) Math.pow(10, l-i-1));
				
				if (j < 10) {
					if (j == 1) {
						u.append("I");
					} else if (j == 2) {
						u.append("II");
					} else if (j == 3) {
						u.append("III");
					} else if (j == 4) {
						u.append("IV");
					} else if (j == 5) {
						u.append("V");
					} else if (j == 6) {
						u.append("VI");
					} else if (j == 7) {
						u.append("VII");
					} else if (j == 8) {
						u.append("VIII");
					} else if (j == 9) {
						u.append("IX");
					}
				} else if (j < 100) {
					if (j == 10) {
						u.append("X");
					} else if (j == 20) {
						u.append("XX");
					} else if (j == 30) {
						u.append("XXX");
					} else if (j == 40) {
						u.append("XL");
					} else if (j == 50) {
						u.append("L");
					} else if (j == 60) {
						u.append("LX");
					} else if (j == 70) {
						u.append("LXX");
					} else if (j == 80) {
						u.append("LXXX");
					} else if (j == 90) {
						u.append("XC");
					}
				} else if (j < 1000) {
					if (j == 100) {
						u.append("C");
					} else if (j == 200) {
						u.append("CC");
					} else if (j == 300) {
						u.append("CCC");
					} else if (j == 400) {
						u.append("CD");
					} else if (j == 500) {
						u.append("D");
					} else if (j == 600) {
						u.append("DC");
					} else if (j == 700) {
						u.append("DCC");
					} else if (j == 800) {
						u.append("DCCC");
					} else if (j == 900) {
						u.append("CM");
					}
				} else if (j < 10000) {
					if (j == 1000) {
						u.append("M");
					} else if (j == 2000) {
						u.append("MM");
					} else if (j == 3000) {
						u.append("MMM");
					}
				}
			}
			System.out.println(u.toString());
		}
	}

}
