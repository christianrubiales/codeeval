import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TrickOrTreat {
	
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));
        
        while (in.hasNext()) {
        	in.next();
        	int v, z, w;
        	
        	String s = in.next();
            v = Integer.parseInt(s.substring(0, s.length() - 1));
        	int t = v * 3;
            in.next();
            
            s = in.next();
            z = Integer.parseInt(s.substring(0, s.length() - 1));
            t += z * 4;
            in.next();
            
            s = in.next();
            w = Integer.parseInt(s.substring(0, s.length() - 1));
            t += w * 5;
            
            in.next();
            t *= Integer.parseInt(in.next());
            System.out.println(t/(v+z+w));
        }
    }
}
